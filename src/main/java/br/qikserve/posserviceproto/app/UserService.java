package br.qikserve.posserviceproto.app;

import br.qikserve.posserviceproto.model.login.APIResponse;
import br.qikserve.posserviceproto.model.login.Empty;
import br.qikserve.posserviceproto.model.login.LoginRequest;
import br.qikserve.posserviceproto.service.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

public class UserService extends UserServiceGrpc.UserServiceImplBase{
    @Override
    public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
        String username = request.getUsername();
        String password = request.getPassword();

        APIResponse.Builder response = APIResponse.newBuilder();
        if (username.equals(password)){
            response
                    .setResponseMessage("Sucesso.")
                    .setResponseCode(200);
        }else{
            response
                    .setResponseMessage("Falha ao efetuar login.")
                    .setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
        super.logout(request, responseObserver);
    }
}
