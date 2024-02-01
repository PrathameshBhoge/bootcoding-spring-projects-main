package com.example.StudentCRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int rollno;
    private String name;
    private String gender;
    private int sem;
    private int year;


}
