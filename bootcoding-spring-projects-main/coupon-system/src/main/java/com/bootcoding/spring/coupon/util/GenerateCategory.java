package com.bootcoding.spring.coupon.util;

import java.util.Random;

public class GenerateCategory {
    public static String category(){
        String[] r ={"Tech Gadgets and Electronics",
                "Fine Dining and Gourmet Cuisine",
                "Home and Garden Decor",
                "Fitness and Wellness Products",
                "Travel and Hotel Stays",
                "Fashion and Apparel Discounts",
                "Books and Entertainment",
                "Car Maintenance and Repair",
                "Kids' Toys and Games",
                "Health and Beauty Essentials"};
        Random random =new Random();
        int s = random.nextInt(r.length);
        return r[s];
    }
}
