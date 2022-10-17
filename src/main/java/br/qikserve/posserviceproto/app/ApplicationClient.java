package br.qikserve.posserviceproto.app;


import br.qikserve.posserviceproto.model.login.APIResponse;
import br.qikserve.posserviceproto.model.login.LoginRequest;
import br.qikserve.posserviceproto.service.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ApplicationClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);

        APIResponse apiResponse = stub.login(
                LoginRequest.newBuilder()
                        .setUsername("Hello!")
                        .setPassword("Hello")
                        .build()
        );

        channel.shutdown();

        System.out.println(apiResponse.getResponseCode() + " - " + apiResponse.getResponseMessage());
    }
}
