package com.patient.patient.util;

import java.util.Random;

public class GenerateGender {
    private static String[] gender={"Male","Female","Transegender"};

    public static String getgender(){
        Random random= new Random();
        int randomIndex= random.nextInt(gender.length);
        String Gender= gender[randomIndex];
        return Gender;
    }
}