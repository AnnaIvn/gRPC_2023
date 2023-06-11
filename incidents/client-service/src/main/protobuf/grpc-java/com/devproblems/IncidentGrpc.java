package com.devproblems;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * declaring Incident services: get, create, update, delete
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: incident.proto")
public final class IncidentGrpc {

  private IncidentGrpc() {}

  public static final String SERVICE_NAME = "com.devproblems.Incident";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.devproblems.Empty,
      com.devproblems.IncidentInfo> METHOD_GET_INCIDENTS =
      io.grpc.MethodDescriptor.<com.devproblems.Empty, com.devproblems.IncidentInfo>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.devproblems.Incident", "getIncidents"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.IncidentInfo.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.devproblems.Id,
      com.devproblems.IncidentInfo> METHOD_GET_INCIDENT =
      io.grpc.MethodDescriptor.<com.devproblems.Id, com.devproblems.IncidentInfo>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.devproblems.Incident", "getIncident"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.Id.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.IncidentInfo.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.devproblems.IncidentInfo,
      com.devproblems.IncidentInfo> METHOD_CREATE_INCIDENT =
      io.grpc.MethodDescriptor.<com.devproblems.IncidentInfo, com.devproblems.IncidentInfo>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.devproblems.Incident", "createIncident"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.IncidentInfo.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.IncidentInfo.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.devproblems.IncidentInfo,
      com.devproblems.IncidentInfo> METHOD_UPDATE_INCIDENT =
      io.grpc.MethodDescriptor.<com.devproblems.IncidentInfo, com.devproblems.IncidentInfo>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.devproblems.Incident", "updateIncident"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.IncidentInfo.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.IncidentInfo.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.devproblems.IncidentInfo,
      com.devproblems.Status> METHOD_DELETE_INCIDENT =
      io.grpc.MethodDescriptor.<com.devproblems.IncidentInfo, com.devproblems.Status>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.devproblems.Incident", "deleteIncident"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.IncidentInfo.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.devproblems.Status.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IncidentStub newStub(io.grpc.Channel channel) {
    return new IncidentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IncidentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IncidentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IncidentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IncidentFutureStub(channel);
  }

  /**
   * <pre>
   * declaring Incident services: get, create, update, delete
   * </pre>
   */
  public static abstract class IncidentImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *server-streaming - asynchronous
     * client sends one request - server will respond with stream of responses
     * </pre>
     */
    public void getIncidents(com.devproblems.Empty request,
        io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INCIDENTS, responseObserver);
    }

    /**
     * <pre>
     *unary - synchronous services
     * client sends one request - server will respond with one response
     * </pre>
     */
    public void getIncident(com.devproblems.Id request,
        io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INCIDENT, responseObserver);
    }

    /**
     */
    public void createIncident(com.devproblems.IncidentInfo request,
        io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_INCIDENT, responseObserver);
    }

    /**
     */
    public void updateIncident(com.devproblems.IncidentInfo request,
        io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_INCIDENT, responseObserver);
    }

    /**
     */
    public void deleteIncident(com.devproblems.IncidentInfo request,
        io.grpc.stub.StreamObserver<com.devproblems.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_INCIDENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_INCIDENTS,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.devproblems.Empty,
                com.devproblems.IncidentInfo>(
                  this, METHODID_GET_INCIDENTS)))
          .addMethod(
            METHOD_GET_INCIDENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.devproblems.Id,
                com.devproblems.IncidentInfo>(
                  this, METHODID_GET_INCIDENT)))
          .addMethod(
            METHOD_CREATE_INCIDENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.devproblems.IncidentInfo,
                com.devproblems.IncidentInfo>(
                  this, METHODID_CREATE_INCIDENT)))
          .addMethod(
            METHOD_UPDATE_INCIDENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.devproblems.IncidentInfo,
                com.devproblems.IncidentInfo>(
                  this, METHODID_UPDATE_INCIDENT)))
          .addMethod(
            METHOD_DELETE_INCIDENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.devproblems.IncidentInfo,
                com.devproblems.Status>(
                  this, METHODID_DELETE_INCIDENT)))
          .build();
    }
  }

  /**
   * <pre>
   * declaring Incident services: get, create, update, delete
   * </pre>
   */
  public static final class IncidentStub extends io.grpc.stub.AbstractStub<IncidentStub> {
    private IncidentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncidentStub(channel, callOptions);
    }

    /**
     * <pre>
     *server-streaming - asynchronous
     * client sends one request - server will respond with stream of responses
     * </pre>
     */
    public void getIncidents(com.devproblems.Empty request,
        io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_INCIDENTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary - synchronous services
     * client sends one request - server will respond with one response
     * </pre>
     */
    public void getIncident(com.devproblems.Id request,
        io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INCIDENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createIncident(com.devproblems.IncidentInfo request,
        io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_INCIDENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateIncident(com.devproblems.IncidentInfo request,
        io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_INCIDENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteIncident(com.devproblems.IncidentInfo request,
        io.grpc.stub.StreamObserver<com.devproblems.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_INCIDENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * declaring Incident services: get, create, update, delete
   * </pre>
   */
  public static final class IncidentBlockingStub extends io.grpc.stub.AbstractStub<IncidentBlockingStub> {
    private IncidentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncidentBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *server-streaming - asynchronous
     * client sends one request - server will respond with stream of responses
     * </pre>
     */
    public java.util.Iterator<com.devproblems.IncidentInfo> getIncidents(
        com.devproblems.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_INCIDENTS, getCallOptions(), request);
    }

    /**
     * <pre>
     *unary - synchronous services
     * client sends one request - server will respond with one response
     * </pre>
     */
    public com.devproblems.IncidentInfo getIncident(com.devproblems.Id request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INCIDENT, getCallOptions(), request);
    }

    /**
     */
    public com.devproblems.IncidentInfo createIncident(com.devproblems.IncidentInfo request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_INCIDENT, getCallOptions(), request);
    }

    /**
     */
    public com.devproblems.IncidentInfo updateIncident(com.devproblems.IncidentInfo request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_INCIDENT, getCallOptions(), request);
    }

    /**
     */
    public com.devproblems.Status deleteIncident(com.devproblems.IncidentInfo request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_INCIDENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * declaring Incident services: get, create, update, delete
   * </pre>
   */
  public static final class IncidentFutureStub extends io.grpc.stub.AbstractStub<IncidentFutureStub> {
    private IncidentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncidentFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous services
     * client sends one request - server will respond with one response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.devproblems.IncidentInfo> getIncident(
        com.devproblems.Id request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INCIDENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.devproblems.IncidentInfo> createIncident(
        com.devproblems.IncidentInfo request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_INCIDENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.devproblems.IncidentInfo> updateIncident(
        com.devproblems.IncidentInfo request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_INCIDENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.devproblems.Status> deleteIncident(
        com.devproblems.IncidentInfo request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_INCIDENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INCIDENTS = 0;
  private static final int METHODID_GET_INCIDENT = 1;
  private static final int METHODID_CREATE_INCIDENT = 2;
  private static final int METHODID_UPDATE_INCIDENT = 3;
  private static final int METHODID_DELETE_INCIDENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IncidentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IncidentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INCIDENTS:
          serviceImpl.getIncidents((com.devproblems.Empty) request,
              (io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo>) responseObserver);
          break;
        case METHODID_GET_INCIDENT:
          serviceImpl.getIncident((com.devproblems.Id) request,
              (io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo>) responseObserver);
          break;
        case METHODID_CREATE_INCIDENT:
          serviceImpl.createIncident((com.devproblems.IncidentInfo) request,
              (io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo>) responseObserver);
          break;
        case METHODID_UPDATE_INCIDENT:
          serviceImpl.updateIncident((com.devproblems.IncidentInfo) request,
              (io.grpc.stub.StreamObserver<com.devproblems.IncidentInfo>) responseObserver);
          break;
        case METHODID_DELETE_INCIDENT:
          serviceImpl.deleteIncident((com.devproblems.IncidentInfo) request,
              (io.grpc.stub.StreamObserver<com.devproblems.Status>) responseObserver);
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

  private static final class IncidentDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.devproblems.IncidentOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IncidentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IncidentDescriptorSupplier())
              .addMethod(METHOD_GET_INCIDENTS)
              .addMethod(METHOD_GET_INCIDENT)
              .addMethod(METHOD_CREATE_INCIDENT)
              .addMethod(METHOD_UPDATE_INCIDENT)
              .addMethod(METHOD_DELETE_INCIDENT)
              .build();
        }
      }
    }
    return result;
  }
}
