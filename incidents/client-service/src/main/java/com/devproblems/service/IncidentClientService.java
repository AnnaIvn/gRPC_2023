package com.devproblems.service;

import com.devproblems.IncidentGrpc;
import com.devproblems.IncidentInfo;
import com.google.protobuf.Descriptors;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IncidentClientService
{
    // we are creating a client to be able to contact from client-service to grpc-service
    @GrpcClient("grpc-service")
    IncidentGrpc.IncidentBlockingStub synchronousClient;

    @GrpcClient("grpc-service")
    IncidentGrpc.IncidentStub asynchronousClient;

    public Map<Descriptors.FieldDescriptor, Object> getIncident(int incidentId){
        IncidentInfo incidentRequest = IncidentInfo.newBuilder().setId(incidentId).build();
        IncidentInfo incidentResponse = synchronousClient.getIncident(incidentRequest);
        return incidentResponse.getAllFields();
    }

}
