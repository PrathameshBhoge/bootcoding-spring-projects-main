package com.teacher.Teacher.controller;

import com.teacher.Teacher.service.teacherservice;
import com.teacher.Teacher.teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher/")
public class Teachercontroller {
    @Autowired
    private teacherservice Teacherservice;

    @GetMapping("getTeacher")
    public String newteacher(){
        return "New Teacher: " + teacherservice.newteacher();
    }

    @GetMapping("getJSON")
    public teacher getdummyjson(){
        return teacher.builder()
                .id(Integer.parseInt(teacherservice.newteacher()))
                .name("Roshan")
                .Department("ETC")
                .Salary(60000)
                .build();
    }

    @GetMapping("getMultipleTeacher")
    public List<String> newTeacher(){
        int qut=20;
        return teacherservice.getNewTeacher(qut);
    }

}
