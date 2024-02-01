package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Studentcontroller {
     @Autowired
    private Studentservice studentservice;

     @PostMapping("/String")
    public Student insertstudent(@RequestBody Student student){
         return  studentservice.insertStudent(student);
     }

     @GetMapping("/getstudent/{rollno}")
    public Student getStudent (@PathVariable int rollno){
       return  studentservice.getStudent(rollno);
     }
}
