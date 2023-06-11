package com.devproblems.controller;

import com.devproblems.service.IncidentClientService;
import com.google.protobuf.Descriptors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class IncidentController
{
    IncidentClientService incidentClientService;

    @GetMapping("/get/{incidentId}")
    public Map<Descriptors.FieldDescriptor, Object> getIncident(@PathVariable String incidentId){
        System.out.println("INCIDENT Returned (from incident controller)");
        return incidentClientService.getIncident(Integer.parseInt(incidentId));
    }
}
