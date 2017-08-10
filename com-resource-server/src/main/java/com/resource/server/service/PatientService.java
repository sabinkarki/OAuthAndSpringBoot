package com.resource.server.service;

import com.resource.server.domain.Patient;

import java.util.List;

/**
 * Created by sabin on 8/10/2017.
 */
public interface PatientService {
    List<Patient> findAll();
}
