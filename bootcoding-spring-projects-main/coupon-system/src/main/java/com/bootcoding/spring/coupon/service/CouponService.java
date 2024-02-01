package com.bootcoding.spring.coupon.service;

import com.bootcoding.spring.coupon.Repository.CouponRepository;
import com.bootcoding.spring.coupon.model.Coupon;
import com.bootcoding.spring.coupon.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CouponService {
@Autowired
    private CouponRepository couponRepository;
    public String newCoupon(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public List<String> getNewCoupon(int quantity){
        List<String> coupons = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            String newCoupon = newCoupon();
            coupons.add(newCoupon);
        }
        return coupons;

    }

    public List<Coupon> insertCoupon(int size, String category, String title){
        List<Coupon> list =new ArrayList<>();
        for (int i =0;i<size;i++){
            Coupon coupon=Coupon.builder().title(title).couponcode(GenerateCouponCode.generateCode())
                    .category(category).description(GenerateDescription.description()).discount(GenerateDiscount.discount())
                    .isactive(GenerateIsActive.isActive()).type(GenerateCouponType.couponType()).status(GenerateStatus.generateStatus())
                    .createdby(GenerateCreateBy.createBy()).createDate(GenerateDate.RandomDate())
                    //.validitydate(GenerateDateValidity.RandomDate())
                    .build();

//            Coupon coupon = Coupon.builder().
//                    couponcode(GenerateCouponCode.generateCode()).category(category).
//                        title(title).build();
            list.add(coupon);
        }
        return couponRepository.saveAll(list);
    }


//    public Coupon generateNewCoupon() {
//        Coupon coupon = Coupon.builder()
//                .id(UUID.randomUUID().toString())
//                .validFor(5 + new Random().nextInt(90))
//                .type("COUPON")
//                .build();
//        return coupon;
//}
}
