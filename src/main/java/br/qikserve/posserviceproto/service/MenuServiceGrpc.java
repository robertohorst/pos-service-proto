package br.qikserve.posserviceproto.service;

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
    comments = "Source: menuservice.proto")
public final class MenuServiceGrpc {

  private MenuServiceGrpc() {}

  public static final String SERVICE_NAME = "MenuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.qikserve.posserviceproto.model.commons.PosConfig,
      br.qikserve.posserviceproto.model.menu.MenuResponse> getGetMenuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMenu",
      requestType = br.qikserve.posserviceproto.model.commons.PosConfig.class,
      responseType = br.qikserve.posserviceproto.model.menu.MenuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.qikserve.posserviceproto.model.commons.PosConfig,
      br.qikserve.posserviceproto.model.menu.MenuResponse> getGetMenuMethod() {
    io.grpc.MethodDescriptor<br.qikserve.posserviceproto.model.commons.PosConfig, br.qikserve.posserviceproto.model.menu.MenuResponse> getGetMenuMethod;
    if ((getGetMenuMethod = MenuServiceGrpc.getGetMenuMethod) == null) {
      synchronized (MenuServiceGrpc.class) {
        if ((getGetMenuMethod = MenuServiceGrpc.getGetMenuMethod) == null) {
          MenuServiceGrpc.getGetMenuMethod = getGetMenuMethod = 
              io.grpc.MethodDescriptor.<br.qikserve.posserviceproto.model.commons.PosConfig, br.qikserve.posserviceproto.model.menu.MenuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MenuService", "getMenu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.qikserve.posserviceproto.model.commons.PosConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.qikserve.posserviceproto.model.menu.MenuResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuServiceMethodDescriptorSupplier("getMenu"))
                  .build();
          }
        }
     }
     return getGetMenuMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MenuServiceStub newStub(io.grpc.Channel channel) {
    return new MenuServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MenuServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MenuServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MenuServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MenuServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MenuServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMenu(br.qikserve.posserviceproto.model.commons.PosConfig request,
        io.grpc.stub.StreamObserver<br.qikserve.posserviceproto.model.menu.MenuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMenuMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMenuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.qikserve.posserviceproto.model.commons.PosConfig,
                br.qikserve.posserviceproto.model.menu.MenuResponse>(
                  this, METHODID_GET_MENU)))
          .build();
    }
  }

  /**
   */
  public static final class MenuServiceStub extends io.grpc.stub.AbstractStub<MenuServiceStub> {
    private MenuServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMenu(br.qikserve.posserviceproto.model.commons.PosConfig request,
        io.grpc.stub.StreamObserver<br.qikserve.posserviceproto.model.menu.MenuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMenuMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MenuServiceBlockingStub extends io.grpc.stub.AbstractStub<MenuServiceBlockingStub> {
    private MenuServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.qikserve.posserviceproto.model.menu.MenuResponse getMenu(br.qikserve.posserviceproto.model.commons.PosConfig request) {
      return blockingUnaryCall(
          getChannel(), getGetMenuMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MenuServiceFutureStub extends io.grpc.stub.AbstractStub<MenuServiceFutureStub> {
    private MenuServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.qikserve.posserviceproto.model.menu.MenuResponse> getMenu(
        br.qikserve.posserviceproto.model.commons.PosConfig request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMenuMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MENU = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MenuServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MenuServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MENU:
          serviceImpl.getMenu((br.qikserve.posserviceproto.model.commons.PosConfig) request,
              (io.grpc.stub.StreamObserver<br.qikserve.posserviceproto.model.menu.MenuResponse>) responseObserver);
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

  private static abstract class MenuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MenuServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.qikserve.posserviceproto.service.ServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MenuService");
    }
  }

  private static final class MenuServiceFileDescriptorSupplier
      extends MenuServiceBaseDescriptorSupplier {
    MenuServiceFileDescriptorSupplier() {}
  }

  private static final class MenuServiceMethodDescriptorSupplier
      extends MenuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MenuServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MenuServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MenuServiceFileDescriptorSupplier())
              .addMethod(getGetMenuMethod())
              .build();
        }
      }
    }
    return result;
  }
}
