package com.bootcoding.spring.coupon.util;

import java.util.Random;

public class GenerateStatus {
    public static String generateStatus(){
        String [] st={"Active","Expired", "Upcoming", "Redeemed"};
        Random random =new Random();
        int index = random.nextInt(st.length);
        return st[index];
    }
}