package com.patient.patient.Service;


import com.patient.patient.Model.Patient;
import com.patient.patient.repository.RepositoryPatient;
import com.patient.patient.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class  patientServicejpa {
 @Autowired
    private  RepositoryPatient repositoryPatient;


    public List<Patient> insertPatient(int size, String department, int age){
        List<Patient> list= new ArrayList<>();
        for(int i=0;i<size;i++){
            Patient patient= Patient.builder().
                    patientname(GeneratePatientName.getname()).
                    age(age).
                    gender(GenerateGender.getgender()).
                    phone(GeneratePhone.getphone()).
                    bedNo(GeneratebedNo.getbedno()).
                   // department(GenerateDepartment.getdepartment()).
                    department(department).
                    dieases(GenerateDiesease.getdisease()).build();
            list.add(patient);
        }
        return repositoryPatient.saveAll(list);
    }



}
