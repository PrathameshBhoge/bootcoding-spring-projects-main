package com.bootcodingpatient.Patient.Controller;

import com.bootcodingpatient.Patient.Model.Patient;
import com.bootcodingpatient.Patient.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Patient/")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/register")
    public String Register(@RequestBody Patient patients){
        patientService.SavePatient(patients);
        return "Success";
    }
}
