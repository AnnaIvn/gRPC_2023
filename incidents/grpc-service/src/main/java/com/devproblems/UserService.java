package com.devproblems;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserService extends userGrpc.userImplBase
{
    @Override
    public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver)
    {
        System.out.println("LOGIN | Started");
        String username = request.getUsername();
        String password = request.getPassword();
        System.out.println("LOGIN | Got "+ username + "text1 and " + password + "text2");
        APIResponse.Builder response = APIResponse.newBuilder();
        System.out.println("LOGIN | Builder constructed");

        if (username.equals(password)){
            //return success message
            response.setResponseCode(0).setResponseMessage("SUCCESS | Username = password");
        }
        else{
            // return failure message
            response.setResponseCode(100).setResponseMessage("FAILURE | Incorrect username != password");
        }
        // wrapping response message and sending it back to the client
        // onNext - sending message, build - to actually get back the response
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();     // closing a call

    }

    @Override
    public void logout(Empty request, StreamObserver<APIResponse> responseObserver)
    {

    }
}
