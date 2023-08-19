package com.patient.patient.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Patient {
    private int id;
    private String patientname;
    private String gender;
    private String dieseas;
    private long phone;
}
