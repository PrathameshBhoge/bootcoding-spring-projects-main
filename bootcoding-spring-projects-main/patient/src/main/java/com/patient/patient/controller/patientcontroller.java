package com.patient.patient.controller;


import com.patient.patient.model.Patient;
import com.patient.patient.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Patient")
public class patientcontroller {

    @Autowired
    private patientService service;

    @PostMapping("/register")
    public String savePatient(@RequestBody Patient patient) {
        service.save(patient);
        System.out.println( patient);

        return "success";
    }

    @GetMapping("/showpatient")
    public List<Patient> getPatient(){
        List<Patient> getpatient=service.getPatients();
        return getpatient;
    }

    @PostMapping("/multipleregister")
    public String multipleData(@RequestBody List<Patient> patient ){
        service.saveMultipleData(patient);
        return "insert multiple record";
    }

    @GetMapping("/patientById/{id}")
    public Patient patientById(@PathVariable("id") int id) {
        Patient p = service.patientById(id);
        return p;
    }

}

