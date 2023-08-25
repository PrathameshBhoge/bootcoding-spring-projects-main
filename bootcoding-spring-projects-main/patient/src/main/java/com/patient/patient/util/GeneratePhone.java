package com.patient.patient.util;

import java.util.Random;

public class GeneratePhone {
    final static int  Max = 1234567890;
    final static int Min = 800000000;

    static Random random= new Random();

    public static int getphone(){
        int phn= random.nextInt(Max - Min);
        int phon= phn+ Min;
        return phon;
    }

}
