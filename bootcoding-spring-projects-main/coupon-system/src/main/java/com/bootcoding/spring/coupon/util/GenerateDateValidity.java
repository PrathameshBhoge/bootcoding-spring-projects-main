package com.bootcoding.spring.coupon.util;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class GenerateDateValidity {
    public static Date RandomDate(){
        long aDay = TimeUnit.DAYS.toMillis(1); // 1 day
        long now = new Date().getTime(); // current time
        Date tomorrow = new Date(now + aDay+10);
        Date aYearAgo = new Date(now - aDay * 365);
        return between(aYearAgo,tomorrow);
    }

    public static Date between(Date startInclusive, Date endExclusive){
        long startMillis = startInclusive.getTime();
        long endMillis = endExclusive.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }

//    public static void main(String[] args) {
//        long aDay = TimeUnit.DAYS.toMillis(1); // 1 day
//        long now = new Date().getTime(); // current time
//        Date tenDaysLater = new Date(now + aDay * 10);
//        Date oneYearAgo = new Date(now - aDay * 365);
//        for (int i = 0; i < 100; i++) {
//            System.out.println(between(oneYearAgo, tenDaysLater));
//        }
//    }
}
