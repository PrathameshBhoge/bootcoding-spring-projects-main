package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentserviceimpl implements Studentservice {
    @Autowired
    private Studentrepo  studentrepo;

    @Override
    public Student insertStudent(Student student){
        return studentrepo.insertstudent(student);

    }

    @Override
    public Student getStudent(int rollno) {
        return studentrepo.getStudent(rollno);
    }

}
