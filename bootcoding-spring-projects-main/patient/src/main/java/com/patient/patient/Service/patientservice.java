package com.patient.patient.Service;

import com.patient.patient.Model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class patientservice {

    public boolean save(Patient p) {
        patients.add(p);
        return true;
    }

    public List<Patient> getPatient(){
        return patients;
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

    private List<Patient> patients = new ArrayList<>();// data store in memorey(tempory data store)
}