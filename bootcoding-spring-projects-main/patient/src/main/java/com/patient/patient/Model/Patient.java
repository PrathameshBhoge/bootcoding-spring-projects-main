package com.patient.patient.Model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Table(name = "Patient-app")
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "patient_name")
    private String patientname;

    @Column(name = "age")
    private int age;

    @Column(name= "phone")
    private long phone;

    @Column(name= "disease")
    private String dieases;

}