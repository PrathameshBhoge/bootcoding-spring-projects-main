package com.patient.patient.Controller;

import com.patient.patient.Model.Patient;
import com.patient.patient.Service.patientservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class patientcontroller {

    @Autowired
    patientservice service;

   /* @PostMapping("/check")
    public String check(@RequestBody String input){
        System.out.println(""+input);
        return "success";

    }*/

    @PostMapping("/register")
    public String savePatient(@RequestBody Patient patient) {
        service.save(patient);
        System.out.println( patient);

        return "success";
    }

    @GetMapping("/showpatient")
    public List<Patient> getPatient(){
        List<Patient> getpatient=service.getPatient();
        return getpatient;

    }

    @PostMapping("/multipleregister")
    public String multipleData(@RequestBody List<Patient> patient ){
        service.saveMultipleData(patient);
        return "insert multiple record";
    }

    @GetMapping("/patientById/{id}")
    public Patient patientById(@PathVariable("id") int id){
        Patient p=service.patientById(id);
        return p;
    }
}