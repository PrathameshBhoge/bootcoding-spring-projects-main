package com.patient.patient.service;

import com.patient.patient.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class patientService {

    private List<Patient> patients = new ArrayList<>();
    public boolean save(Patient p){
        patients.add(p);
        return true;
    }

    public List<Patient> getPatients(){
        return patients;
    }

    public boolean savemultiple(List<Patient> patients){
        for(Patient p: patients ){
            save(p);
        }
        return true;
    }

    public boolean saveMultipleData(List<Patient> p){
        for(Patient patient:p){
            boolean a=save(patient);
            System.out.println(a);
        }

        return true;
    }

    public Patient patientById(int id)
    {
        for(Patient p:patients ){//this loop apply in tempory memory
            if(id==p.getId())
                return p;
        }
        return null;
    }

    private List<Patient> patient = new ArrayList<>();


}
