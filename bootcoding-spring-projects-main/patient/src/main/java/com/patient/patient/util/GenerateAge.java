package com.patient.patient.util;

import java.util.Random;

public class GenerateAge {
    final static int MIN= 1;
    final static int MAX= 100;
    static Random random= new Random();


     public static int getage(){
         int age= random.nextInt(MAX - MIN);
         int num= MIN+age;
         return num;
     }
}
