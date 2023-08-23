package com.bootcodingpatient.Patient.Model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name="Patient-app")
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private int id;

    @Column(name ="first_name")
    private String firstname;

    @Column(name="last_name")
    private String lastname;

    @Column(name = "phone")
    private long phone;

    @Column(name= "disease")
    private String disease;

}
