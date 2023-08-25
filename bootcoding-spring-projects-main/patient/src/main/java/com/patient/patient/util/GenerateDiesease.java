package com.patient.patient.util;

import java.util.Random;

public class GenerateDiesease {
    private static String [] disease={"Influenza (Flu)","Blood Cancer","Skin Cancer", " Brain Tumor"
                                        ,"Tuberculosis","HIV/AIDS","Dengue Fever","Heart Failure",
                                            "Hypertension (High Blood Pressure)","Pneumonia",
                                        "Gastroesophageal Reflux Disease (GERD)","Alzheimer's Disease"};

    public static String getdisease(){
        Random random = new Random();
        int Index= random.nextInt(disease.length);
        String diseases= disease[Index];
        return diseases;

    }
}
