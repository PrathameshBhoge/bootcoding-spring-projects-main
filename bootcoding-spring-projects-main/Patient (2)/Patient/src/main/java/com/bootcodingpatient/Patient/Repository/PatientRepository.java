package com.bootcodingpatient.Patient.Repository;

import com.bootcodingpatient.Patient.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository  extends JpaRepository<Patient, Integer> {

}
