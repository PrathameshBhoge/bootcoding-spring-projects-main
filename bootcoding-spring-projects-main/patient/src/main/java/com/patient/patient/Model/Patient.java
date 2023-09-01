package com.patient.patient.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@Table(name = "Patient")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "patient_name")
    private String patientname;
    private int age;
    private String gender;
    private long phone;
    @Column(name="bed_no")
    private int  bedNo;
    private String department;
    private String dieases;

}