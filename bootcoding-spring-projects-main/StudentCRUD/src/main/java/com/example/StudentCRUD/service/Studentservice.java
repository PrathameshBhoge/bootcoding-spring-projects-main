package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;

public interface Studentservice {

    Student insertStudent(Student student) ;


    Student getStudent(int rollno);
}


