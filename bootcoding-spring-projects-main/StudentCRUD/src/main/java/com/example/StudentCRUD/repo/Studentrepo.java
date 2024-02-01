package com.example.StudentCRUD.repo;

import com.example.StudentCRUD.model.Student;

public interface Studentrepo {



    Student insertstudent(Student student);

    Student getStudent(int rollno);
}
