package com.patient.patient.Controller;

import com.patient.patient.Model.Patient;
import com.patient.patient.Service.patientServicejpa;
import com.patient.patient.Service.patientservice;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")
public class patientcontroller {

    @Autowired
    patientservice service;

    @Autowired
    patientServicejpa patientServicejpa;



    @PostMapping("/save_patient/{size}")
    public String saverandom (@PathVariable int size , @RequestBody Patient patient) {
        patientServicejpa.insertPatient(size/*,patient.getDepartment(), patient.getAge()*/);
        return "success size";
    }

    @GetMapping("/getallpatient")
    public List<Patient> getallpatient(){
        return patientServicejpa.getallpatient();
    }

    @PutMapping("/update/{id}")
    public Optional<Patient> updatepatientdetails(@PathVariable("id") int id, @RequestBody Patient patient){
        return patientServicejpa.updatepatientdetailsbyid(id,patient);
    }

    @DeleteMapping("/{id}")
    public String Deletepatientbyid(@PathVariable("id") int id ){
        patientServicejpa.deletepatientByid(id);
        return "Patient Decharged";
    }
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