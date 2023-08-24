package com.bootcoding.spring.coupon.util;

import java.util.Random;

public class GenerateCreateBy {
    public static  String createBy(){
        String [] arr ={"Amazon","Zomato","GPay","phonePay","Swiggy","IndiaMart"};
        Random random =new Random();
        int index = random.nextInt(arr.length);
        return arr[index];

    }
}
