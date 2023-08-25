package com.bootcodingpatient.Patient.Service;

import com.bootcodingpatient.Patient.Model.Patient;
import com.bootcodingpatient.Patient.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;



    private List<Patient> users = new ArrayList<>();

    public void SavePatient(Patient patient){
        patientRepository.save(patient);
    }

    public void SavePatient(List<Patient> patients){
            patientRepository.saveAll(patients);
    }

}
