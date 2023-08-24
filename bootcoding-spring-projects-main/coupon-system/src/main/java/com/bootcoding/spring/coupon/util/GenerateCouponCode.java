package com.bootcoding.spring.coupon.util;

import java.util.UUID;

public class GenerateCouponCode {
    public static String generateCode(){

        String ui = UUID.randomUUID().toString();
        return ui;
    }
}
