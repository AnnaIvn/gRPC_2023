package com.devproblems;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ClientApplication.class, args);

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

        // stubs - generate from proto file
        IncidentGrpc.IncidentBlockingStub incidentStub = IncidentGrpc.newBlockingStub(channel);

        IncidentInfo request = IncidentInfo.newBuilder().setId(0).setImage("image0").setCoordinates("000.000.000").setReport("report0").build();

        IncidentInfo response = incidentStub.createIncident(request);

        System.out.println(response);
    }
}
