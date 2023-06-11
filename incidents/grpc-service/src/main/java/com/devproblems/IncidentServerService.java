package com.devproblems;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;


// implementation of grpc-service
@Slf4j
@GrpcService      // this annotation comes from grpc-spring-boot-starter dependency
// we are extending this class, so we could override methods from there
public class IncidentServerService extends IncidentGrpc.IncidentImplBase
{
    @Override
    public void getIncident(IncidentInfo request, StreamObserver<IncidentInfo> responseObserver)
    {
        TempDb.getIncidentsFromTempDb()
                .stream()
                .filter(incidentInfo -> incidentInfo.getId() == request.getId())
                .findFirst()
                .ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();

//        Integer id = request.getId();
//        System.out.println("GET INCIDENT | Got following id: " + id);
//        IncidentInfo.Builder response = IncidentInfo.newBuilder();
//        //response.

    }

    @Override
    public void createIncident(IncidentInfo request, StreamObserver<IncidentInfo> responseObserver)
    {
        Integer id = request.getId();                       // getting request
        String image = request.getImage();
        String coordinates = request.getCoordinates();
        String report = request.getReport();
        System.out.println("CREATE INCIDENT | Got following: "
                + id + " id, "
                + image + " image, "
                + coordinates + " coordinates, "
                + report + " report");

        IncidentInfo.Builder response = IncidentInfo.newBuilder();
        response.setId(id).setImage(image).setCoordinates(coordinates).setReport(report);

        // wrapping response message and sending it back to the client
        // onNext - sending message, build - to actually get back the response
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();     // closing a call
        System.out.println("INCIDENT CREATED | End");
    }

    @Override
    public void updateIncident(IncidentInfo request, StreamObserver<IncidentInfo> responseObserver)
    {
        Integer id = request.getId();                       // getting request
        String image = request.getImage();
        String coordinates = request.getCoordinates();
        String report = request.getReport();
        System.out.println("UPDATE INCIDENT | Got following: "
                + id + " id, "
                + image + " image, "
                + coordinates + " coordinates, "
                + report + " report");

    }
}
