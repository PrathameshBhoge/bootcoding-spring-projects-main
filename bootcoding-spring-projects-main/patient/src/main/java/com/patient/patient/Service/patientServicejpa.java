package com.patient.patient.Service;


import com.patient.patient.Model.Patient;
import com.patient.patient.repository.RepositoryPatient;
import com.patient.patient.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class  patientServicejpa {
 @Autowired
    private  RepositoryPatient repositoryPatient;


    public List<Patient> insertPatient(int size){
        List<Patient> list= new ArrayList<>();
        for(int i=0;i<size;i++){
            Patient patient= Patient.builder().
                    patientname(GeneratePatientName.getname()).
                    age(GenerateAge.getage()).
                    gender(GenerateGender.getgender()).
                    phone(GeneratePhone.getphone()).
                    bedNo(GeneratebedNo.getbedno()).
                    department(GenerateDepartment.getdepartment()).
                    dieases(GenerateDiesease.getdisease()).build();
            list.add(patient);
        }
        return repositoryPatient.saveAll(list);
    }

    public List<Patient> getallpatient(){
        return repositoryPatient.findAll();
    }

    public void deletepatientByid(int id){
        repositoryPatient.deleteById(id);
    }

    public Optional<Patient> updatepatientdetailsbyid(int id, Patient patient){
        Optional<Patient> patientdetails = repositoryPatient.findById(id);
        if(patientdetails != null){
            repositoryPatient.save(patient);
        }
        return patientdetails;
    }



}
