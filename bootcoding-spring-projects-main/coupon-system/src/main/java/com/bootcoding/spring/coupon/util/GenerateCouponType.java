package com.bootcoding.spring.coupon.util;

import java.util.Random;

public class GenerateCouponType {
    public static String couponType(){
        String [] s = {
                "Percentage Discount",
                "Fixed Amount Discount",
                "Buy One, Get One (BOGO)",
                "Free Shipping",
                "Limited-Time Offer",
                "Minimum Purchase Requirement",
                "New Customer Discount",
                "Loyalty Rewards",
                "Referral Coupons",
                "Seasonal or Holiday Discounts",
                "Clearance or Closeout Sales",
                "Flash Sales",
                "Bundle Deals",
                "Cashback",
                "Employee Discounts",
                "VIP or Premium Customer Coupons",
                "Online vs. In-Store Coupons",
                "Cross-Promotion Coupons"
        };
        Random random =new Random();
        int index =random.nextInt(s.length);
        return  s[index];
    }
}
