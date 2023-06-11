package com.server;

import com.devproblems.IncidentServerService;
import com.devproblems.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@Slf4j                                // for logging
//@SpringBootApplication
public class GRPCServer
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Server server = ServerBuilder.
                forPort(9090).addService(new IncidentServerService()).build();

        server.start();
        log.info("SERVER STARTED | At port " + server.getPort());

        server.awaitTermination();
        //SpringApplication.run(GRPCServer.class, args);
    }
}
