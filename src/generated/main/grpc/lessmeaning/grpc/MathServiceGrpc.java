package lessmeaning.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: math_program.proto")
public final class MathServiceGrpc {

  private MathServiceGrpc() {}

  public static final String SERVICE_NAME = "helloworld.MathService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSqrMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> METHOD_SQR = getSqrMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getSqrMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getSqrMethod() {
    return getSqrMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getSqrMethodHelper() {
    io.grpc.MethodDescriptor<lessmeaning.grpc.Number, lessmeaning.grpc.Number> getSqrMethod;
    if ((getSqrMethod = MathServiceGrpc.getSqrMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getSqrMethod = MathServiceGrpc.getSqrMethod) == null) {
          MathServiceGrpc.getSqrMethod = getSqrMethod = 
              io.grpc.MethodDescriptor.<lessmeaning.grpc.Number, lessmeaning.grpc.Number>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.MathService", "sqr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lessmeaning.grpc.Number.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lessmeaning.grpc.Number.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("sqr"))
                  .build();
          }
        }
     }
     return getSqrMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFactorizationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> METHOD_FACTORIZATION = getFactorizationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getFactorizationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getFactorizationMethod() {
    return getFactorizationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getFactorizationMethodHelper() {
    io.grpc.MethodDescriptor<lessmeaning.grpc.Number, lessmeaning.grpc.Number> getFactorizationMethod;
    if ((getFactorizationMethod = MathServiceGrpc.getFactorizationMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getFactorizationMethod = MathServiceGrpc.getFactorizationMethod) == null) {
          MathServiceGrpc.getFactorizationMethod = getFactorizationMethod = 
              io.grpc.MethodDescriptor.<lessmeaning.grpc.Number, lessmeaning.grpc.Number>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.MathService", "factorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lessmeaning.grpc.Number.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lessmeaning.grpc.Number.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("factorization"))
                  .build();
          }
        }
     }
     return getFactorizationMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStdDevMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> METHOD_STD_DEV = getStdDevMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getStdDevMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getStdDevMethod() {
    return getStdDevMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getStdDevMethodHelper() {
    io.grpc.MethodDescriptor<lessmeaning.grpc.Number, lessmeaning.grpc.Number> getStdDevMethod;
    if ((getStdDevMethod = MathServiceGrpc.getStdDevMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getStdDevMethod = MathServiceGrpc.getStdDevMethod) == null) {
          MathServiceGrpc.getStdDevMethod = getStdDevMethod = 
              io.grpc.MethodDescriptor.<lessmeaning.grpc.Number, lessmeaning.grpc.Number>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.MathService", "std_dev"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lessmeaning.grpc.Number.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lessmeaning.grpc.Number.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("std_dev"))
                  .build();
          }
        }
     }
     return getStdDevMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMaxMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> METHOD_GET_MAX = getGetMaxMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getGetMaxMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getGetMaxMethod() {
    return getGetMaxMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lessmeaning.grpc.Number,
      lessmeaning.grpc.Number> getGetMaxMethodHelper() {
    io.grpc.MethodDescriptor<lessmeaning.grpc.Number, lessmeaning.grpc.Number> getGetMaxMethod;
    if ((getGetMaxMethod = MathServiceGrpc.getGetMaxMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getGetMaxMethod = MathServiceGrpc.getGetMaxMethod) == null) {
          MathServiceGrpc.getGetMaxMethod = getGetMaxMethod = 
              io.grpc.MethodDescriptor.<lessmeaning.grpc.Number, lessmeaning.grpc.Number>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.MathService", "get_max"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lessmeaning.grpc.Number.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lessmeaning.grpc.Number.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("get_max"))
                  .build();
          }
        }
     }
     return getGetMaxMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MathServiceStub newStub(io.grpc.Channel channel) {
    return new MathServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MathServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MathServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MathServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MathServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MathServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sqr(lessmeaning.grpc.Number request,
        io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> responseObserver) {
      asyncUnimplementedUnaryCall(getSqrMethodHelper(), responseObserver);
    }

    /**
     */
    public void factorization(lessmeaning.grpc.Number request,
        io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> responseObserver) {
      asyncUnimplementedUnaryCall(getFactorizationMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> stdDev(
        io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> responseObserver) {
      return asyncUnimplementedStreamingCall(getStdDevMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> getMax(
        io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetMaxMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSqrMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lessmeaning.grpc.Number,
                lessmeaning.grpc.Number>(
                  this, METHODID_SQR)))
          .addMethod(
            getFactorizationMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lessmeaning.grpc.Number,
                lessmeaning.grpc.Number>(
                  this, METHODID_FACTORIZATION)))
          .addMethod(
            getStdDevMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                lessmeaning.grpc.Number,
                lessmeaning.grpc.Number>(
                  this, METHODID_STD_DEV)))
          .addMethod(
            getGetMaxMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                lessmeaning.grpc.Number,
                lessmeaning.grpc.Number>(
                  this, METHODID_GET_MAX)))
          .build();
    }
  }

  /**
   */
  public static final class MathServiceStub extends io.grpc.stub.AbstractStub<MathServiceStub> {
    private MathServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceStub(channel, callOptions);
    }

    /**
     */
    public void sqr(lessmeaning.grpc.Number request,
        io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSqrMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void factorization(lessmeaning.grpc.Number request,
        io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFactorizationMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> stdDev(
        io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getStdDevMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> getMax(
        io.grpc.stub.StreamObserver<lessmeaning.grpc.Number> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetMaxMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MathServiceBlockingStub extends io.grpc.stub.AbstractStub<MathServiceBlockingStub> {
    private MathServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public lessmeaning.grpc.Number sqr(lessmeaning.grpc.Number request) {
      return blockingUnaryCall(
          getChannel(), getSqrMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<lessmeaning.grpc.Number> factorization(
        lessmeaning.grpc.Number request) {
      return blockingServerStreamingCall(
          getChannel(), getFactorizationMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MathServiceFutureStub extends io.grpc.stub.AbstractStub<MathServiceFutureStub> {
    private MathServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lessmeaning.grpc.Number> sqr(
        lessmeaning.grpc.Number request) {
      return futureUnaryCall(
          getChannel().newCall(getSqrMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SQR = 0;
  private static final int METHODID_FACTORIZATION = 1;
  private static final int METHODID_STD_DEV = 2;
  private static final int METHODID_GET_MAX = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MathServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MathServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SQR:
          serviceImpl.sqr((lessmeaning.grpc.Number) request,
              (io.grpc.stub.StreamObserver<lessmeaning.grpc.Number>) responseObserver);
          break;
        case METHODID_FACTORIZATION:
          serviceImpl.factorization((lessmeaning.grpc.Number) request,
              (io.grpc.stub.StreamObserver<lessmeaning.grpc.Number>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STD_DEV:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.stdDev(
              (io.grpc.stub.StreamObserver<lessmeaning.grpc.Number>) responseObserver);
        case METHODID_GET_MAX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getMax(
              (io.grpc.stub.StreamObserver<lessmeaning.grpc.Number>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MathServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lessmeaning.grpc.MathServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MathService");
    }
  }

  private static final class MathServiceFileDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier {
    MathServiceFileDescriptorSupplier() {}
  }

  private static final class MathServiceMethodDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MathServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MathServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MathServiceFileDescriptorSupplier())
              .addMethod(getSqrMethodHelper())
              .addMethod(getFactorizationMethodHelper())
              .addMethod(getStdDevMethodHelper())
              .addMethod(getGetMaxMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
