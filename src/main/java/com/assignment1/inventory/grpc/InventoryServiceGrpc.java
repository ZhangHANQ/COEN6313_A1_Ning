package com.assignment1.inventory.grpc;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: InventoryUser.proto")
public final class InventoryServiceGrpc {

  private InventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "InventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.InventoryID,
      com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> getSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchByID",
      requestType = com.assignment1.inventory.grpc.InventoryUserProto.InventoryID.class,
      responseType = com.assignment1.inventory.grpc.InventoryUserProto.InventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.InventoryID,
      com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> getSearchByIDMethod() {
    io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.InventoryID, com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> getSearchByIDMethod;
    if ((getSearchByIDMethod = InventoryServiceGrpc.getSearchByIDMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getSearchByIDMethod = InventoryServiceGrpc.getSearchByIDMethod) == null) {
          InventoryServiceGrpc.getSearchByIDMethod = getSearchByIDMethod = 
              io.grpc.MethodDescriptor.<com.assignment1.inventory.grpc.InventoryUserProto.InventoryID, com.assignment1.inventory.grpc.InventoryUserProto.InventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "searchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment1.inventory.grpc.InventoryUserProto.InventoryID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment1.inventory.grpc.InventoryUserProto.InventoryList.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("searchByID"))
                  .build();
          }
        }
     }
     return getSearchByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange,
      com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> getSearchByIDRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchByIDRange",
      requestType = com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange.class,
      responseType = com.assignment1.inventory.grpc.InventoryUserProto.InventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange,
      com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> getSearchByIDRangeMethod() {
    io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange, com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> getSearchByIDRangeMethod;
    if ((getSearchByIDRangeMethod = InventoryServiceGrpc.getSearchByIDRangeMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getSearchByIDRangeMethod = InventoryServiceGrpc.getSearchByIDRangeMethod) == null) {
          InventoryServiceGrpc.getSearchByIDRangeMethod = getSearchByIDRangeMethod = 
              io.grpc.MethodDescriptor.<com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange, com.assignment1.inventory.grpc.InventoryUserProto.InventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "searchByIDRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment1.inventory.grpc.InventoryUserProto.InventoryList.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("searchByIDRange"))
                  .build();
          }
        }
     }
     return getSearchByIDRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest,
      com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse> getGetDistributionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDistribution",
      requestType = com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest.class,
      responseType = com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest,
      com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse> getGetDistributionMethod() {
    io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest, com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse> getGetDistributionMethod;
    if ((getGetDistributionMethod = InventoryServiceGrpc.getGetDistributionMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetDistributionMethod = InventoryServiceGrpc.getGetDistributionMethod) == null) {
          InventoryServiceGrpc.getGetDistributionMethod = getGetDistributionMethod = 
              io.grpc.MethodDescriptor.<com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest, com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "getDistribution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("getDistribution"))
                  .build();
          }
        }
     }
     return getGetDistributionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest,
      com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest.class,
      responseType = com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest,
      com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest, com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = InventoryServiceGrpc.getUpdateMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getUpdateMethod = InventoryServiceGrpc.getUpdateMethod) == null) {
          InventoryServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest, com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryServiceStub newStub(io.grpc.Channel channel) {
    return new InventoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InventoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InventoryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchByID(com.assignment1.inventory.grpc.InventoryUserProto.InventoryID request,
        io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByIDMethod(), responseObserver);
    }

    /**
     */
    public void searchByIDRange(com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange request,
        io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByIDRangeMethod(), responseObserver);
    }

    /**
     */
    public void getDistribution(com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest request,
        io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDistributionMethod(), responseObserver);
    }

    /**
     */
    public void update(com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.assignment1.inventory.grpc.InventoryUserProto.InventoryID,
                com.assignment1.inventory.grpc.InventoryUserProto.InventoryList>(
                  this, METHODID_SEARCH_BY_ID)))
          .addMethod(
            getSearchByIDRangeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange,
                com.assignment1.inventory.grpc.InventoryUserProto.InventoryList>(
                  this, METHODID_SEARCH_BY_IDRANGE)))
          .addMethod(
            getGetDistributionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest,
                com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse>(
                  this, METHODID_GET_DISTRIBUTION)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest,
                com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse>(
                  this, METHODID_UPDATE)))
          .build();
    }
  }

  /**
   */
  public static final class InventoryServiceStub extends io.grpc.stub.AbstractStub<InventoryServiceStub> {
    private InventoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchByID(com.assignment1.inventory.grpc.InventoryUserProto.InventoryID request,
        io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByIDRange(com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange request,
        io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchByIDRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDistribution(com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest request,
        io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDistributionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InventoryServiceBlockingStub extends io.grpc.stub.AbstractStub<InventoryServiceBlockingStub> {
    private InventoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.assignment1.inventory.grpc.InventoryUserProto.InventoryList searchByID(com.assignment1.inventory.grpc.InventoryUserProto.InventoryID request) {
      return blockingUnaryCall(
          getChannel(), getSearchByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> searchByIDRange(
        com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchByIDRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse getDistribution(com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDistributionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse update(com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InventoryServiceFutureStub extends io.grpc.stub.AbstractStub<InventoryServiceFutureStub> {
    private InventoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assignment1.inventory.grpc.InventoryUserProto.InventoryList> searchByID(
        com.assignment1.inventory.grpc.InventoryUserProto.InventoryID request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse> getDistribution(
        com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDistributionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse> update(
        com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_BY_ID = 0;
  private static final int METHODID_SEARCH_BY_IDRANGE = 1;
  private static final int METHODID_GET_DISTRIBUTION = 2;
  private static final int METHODID_UPDATE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_BY_ID:
          serviceImpl.searchByID((com.assignment1.inventory.grpc.InventoryUserProto.InventoryID) request,
              (io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.InventoryList>) responseObserver);
          break;
        case METHODID_SEARCH_BY_IDRANGE:
          serviceImpl.searchByIDRange((com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange) request,
              (io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.InventoryList>) responseObserver);
          break;
        case METHODID_GET_DISTRIBUTION:
          serviceImpl.getDistribution((com.assignment1.inventory.grpc.InventoryUserProto.PercentileRequest) request,
              (io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.assignment1.inventory.grpc.InventoryUserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryService");
    }
  }

  private static final class InventoryServiceFileDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier {
    InventoryServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryServiceMethodDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryServiceFileDescriptorSupplier())
              .addMethod(getSearchByIDMethod())
              .addMethod(getSearchByIDRangeMethod())
              .addMethod(getGetDistributionMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
