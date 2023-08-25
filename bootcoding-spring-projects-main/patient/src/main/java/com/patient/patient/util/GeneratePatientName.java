package com.patient.patient.util;

import java.util.Random;

public class GeneratePatientName {
    public static String [] name= {"Bob Marly","Honey Sing","Ankita sharma","Rajat kukreja","Mahesh Dalle","Omkar reddy"
                            ,"Suman Rathi","Ganesh Shethe"};

       public static String getname(){
           Random random = new Random();
           int randomindex= random.nextInt(name.length);
           String names= name[randomindex];
           return names +" ";
       }
}
