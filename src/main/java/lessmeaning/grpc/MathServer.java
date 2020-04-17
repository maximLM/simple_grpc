package lessmeaning.grpc;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MathServer {

    private static final Logger logger = Logger.getLogger(MathServer.class.getName());

    private int port = 42420;
    private Server server;

    private void start() throws Exception {
        logger.info("Starting the grpc server");

        server = ServerBuilder.forPort(port)
                .addService(new MathServerImpl())
                .build()
                .start();

        logger.info("Server started. Listening on port " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** JVM is shutting down. Turning off grpc server as well ***");
            MathServer.this.stop();
            System.err.println("*** shutdown complete ***");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }


    public static void main(String[] args) throws Exception {
        logger.info("Server started");
        final MathServer helloWorldServer = new MathServer();

        helloWorldServer.start();
        helloWorldServer.blockUntilShutdown();
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private class MathServerImpl extends MathServiceGrpc.MathServiceImplBase {

        @Override
        public void sqr(Number request, StreamObserver<Number> responseObserver) {
            Number response = Number.newBuilder().setVal((float)Math.sqrt(request.getVal())).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void factorization(Number request, StreamObserver<Number> responseObserver) {
            int n = (int)request.getVal();
            for (int i = 2; i * i <= n; ++i) {
                while (n % i == 0) {
                    responseObserver.onNext(Number.newBuilder().setVal(i).build());
                    n /= i;
                }
            }
            if (n > 1)
                responseObserver.onNext(Number.newBuilder().setVal(n).build());
            responseObserver.onCompleted();
        }



        @Override
        public StreamObserver<Number> stdDev(StreamObserver<Number> responseObserver) {
            List<Float> a = new ArrayList<>();

            return new StreamObserver<Number>() {
                @Override
                public void onNext(Number value) {
                    a.add(value.getVal());
                }

                @Override
                public void onError(Throwable t) {
                    logger.info("Error occured when parsing stream of numbers for std");
                }

                @Override
                public void onCompleted() {
                    if (a.size() <= 1)
                        throw new RuntimeException("array must be size at least 2 found size " + a.size());
                    float ev = 0;
                    for (float x : a)
                        ev += x;
                    ev /= a.size();
                    float s = 0;
                    for (float x : a)
                        s += (x - ev) * (x -  ev);
                    s /= a.size() - 1;
                    responseObserver.onNext(Number.newBuilder().setVal(s).build());
                    responseObserver.onCompleted();
                }
            };
        }

        @Override
        public StreamObserver<Number> getMax(StreamObserver<Number> responseObserver) {
            final float[] current_max = {Float.MIN_VALUE};
            return new StreamObserver<Number>() {
                @Override
                public void onNext(Number value) {
                    current_max[0] = Math.max(value.getVal(), current_max[0]);
                    responseObserver.onNext(Number.newBuilder().setVal(current_max[0]).build());
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {
                    responseObserver.onCompleted();
                }
            };
        }
    }
}
