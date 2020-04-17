package lessmeaning.grpc;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MathClient {
    private static final Logger logger = Logger.getLogger(MathClient.class.getName());

    private final ManagedChannel channel;
    private MathServiceGrpc.MathServiceBlockingStub blockingStub;
    private MathServiceGrpc.MathServiceStub asyncStub;

    public MathClient(String hostname, int port) {
        channel = ManagedChannelBuilder.forAddress(hostname, port)
                .usePlaintext(true)
                .build();
        blockingStub = MathServiceGrpc.newBlockingStub(channel);
        asyncStub = MathServiceGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }


    public void sqrOnServer(float number) {
        logger.info("SQR OF " + number);
        try {
            Number response = blockingStub.sqr(Number.newBuilder().setVal(number).build());
            logger.info("--------------------------------------------------------------------------------------- sqr " + response.getVal());
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "Request to grpc server failed", e);
        }
    }

    public void factorizationOnServer(int n) {
        logger.info("FACTORIZATION OF " + n);
        try {
            Iterator<Number> iterator = blockingStub.factorization(Number.newBuilder().setVal(n).build());
            List<Integer> responseList = new ArrayList<>();
            while (iterator.hasNext()) {
                responseList.add((int)iterator.next().getVal());
            }
            System.out.println("--------------------------------------------------------------------------------------- factorization" + responseList);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "Request to grpc server failed", e);
        }
    }

    public void stdOnServer(List<Float> a) {
        logger.info("STD deviation of " + a);
        StreamObserver<Number> responseObserver = new StreamObserver<Number>() {
            @Override
            public void onNext(Number number) {
                float std = number.getVal();
                logger.info("--------------------------------------------------------------------------------------- std " + std);
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
            }

        };

        StreamObserver<Number> requestObserver = asyncStub.stdDev(responseObserver);
        try {

            for (float x : a) {
                requestObserver.onNext(Number.newBuilder().setVal(x).build());
            }
            requestObserver.onCompleted();
        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        }
    }

    private void getMaxOnServer(List<Float> a) {
        logger.info("MAX streaming");
        StreamObserver<Number> responseObserver = new StreamObserver<Number>() {
            @Override
            public void onNext(Number value) {
                logger.info("--------------------------------------------------------------------------------------- max " + value.getVal());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        };
        StreamObserver<Number> requestObserver = asyncStub.getMax(responseObserver);
        for (float x : a) {
            requestObserver.onNext(Number.newBuilder().setVal(x).build());
        }
        requestObserver.onCompleted();
    }

    public static void main(String[] args) throws Exception {
        MathClient client = new MathClient("localhost", 42420);

        try {
            client.sqrOnServer(36);
            client.factorizationOnServer(33012);
            client.stdOnServer(Arrays.asList(1f, 2f, 13f, 3145f, 3155f, 3f, 23f));
            client.getMaxOnServer(Arrays.asList(1f, 2f, 13f, 3145f, 3155f, 1e10f, 23f));
        } finally {
            client.shutdown();
        }
    }



}
