package com.patient.patient.util;

import java.util.Random;

public class GenerateDepartment {
    private static String [] department={"General OPD","Specialty Clinics",
                                            "Internal Medicine Clinic",
                                            "ICU",
                                           "Pediatric Clinic",
                                            "Orthopedic Clinic",
                                            "Gynecology and Obstetrics Clinic",
                                            "Ophthalmology Clinic",
                                            "Diabetes Clinic"
                                    };

        public static String getdepartment(){
            Random random= new Random();
            int randomIndex= random.nextInt(department.length);
            String names= department[randomIndex];
            return names;
        }
}
