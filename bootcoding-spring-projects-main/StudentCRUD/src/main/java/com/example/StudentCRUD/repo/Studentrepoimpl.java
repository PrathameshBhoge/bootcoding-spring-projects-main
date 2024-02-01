package com.example.StudentCRUD.repo;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class Studentrepoimpl implements Studentrepo {
    private Map<Integer, Student> studentMa= new HashMap<>();

    @Override
    public Student insertstudent(Student student) {
       studentMa.put(student.getRollno(), student);
       return student;
    }

    @Override
    public Student getStudent(int rollno) {
        return studentMa.get(rollno);
    }
}
