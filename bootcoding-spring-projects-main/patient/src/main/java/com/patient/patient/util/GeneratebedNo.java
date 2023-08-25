package com.patient.patient.util;

import java.util.Random;

public class GeneratebedNo {
    final static int Min = 1;
    final static int Max= 100;

     static Random random = new Random();

     public static int getbedno(){
         int no= random.nextInt(Max-Min);
         int bedNo=no+Min;
         return bedNo;
     }
}
