package com.patient.patient.repository;

import com.patient.patient.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPatient extends JpaRepository<Patient,Integer> {

}
