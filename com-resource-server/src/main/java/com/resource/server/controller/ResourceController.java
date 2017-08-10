package com.resource.server.controller;

import com.resource.server.domain.Patient;
import com.resource.server.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sabin on 8/10/2017.
 */
@RestController
public class ResourceController {

    @Autowired
    private PatientService patientService;

    @GetMapping(value = "/resource/patient/all")
    public List<Patient> findAll() {
        return patientService.findAll();
    }
}
