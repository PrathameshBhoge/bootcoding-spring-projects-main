package com.teacher.Teacher.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class teacherservice {
    public static String newteacher(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static List<String> getNewTeacher(int quantity){
        List<String> teacher = new ArrayList<>();
        for(int i=0;i<quantity;i++){
            String newteacher = newteacher();
            teacher.add(newteacher);
        }
        return teacher;
    }
}
