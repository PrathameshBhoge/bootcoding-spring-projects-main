package com.bootcoding.spring.coupon.controller;

import com.bootcoding.spring.coupon.model.Coupon;
import com.bootcoding.spring.coupon.service.CouponService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/coupon/")
public class CouponController {
    @Autowired
    private CouponService couponService;
    // HTTP Methods Get

    //Get all Coupons
    @GetMapping("GetAllCoupon")
    public List<String> getCoupon(){
        int qut=10;
        return couponService.getNewCoupon(qut);
    }

    //Get Coupon by using couponId
    @GetMapping("GetCouponId/{id}")
    public String getCouponById(@PathVariable("id") String couponId){
        return couponId +"Is"+"-" + couponService.newCoupon();
    }

//    @GetMapping("coupon-id/{id}")
//    public Coupon getCouponObjectById(@PathVariable("id") String couponId){
//        Coupon coupon = couponService.generateNewCoupon();
//        return coupon;
//    }
//
//    @GetMapping("generate/new")
//    public Coupon generateNewCoupon(){
//        Coupon coupon = couponService.generateNewCoupon();
//        return coupon;
//    }


    @GetMapping("getCoupon")
    public String newCoupon(){
        return "New Coupon : " + couponService.newCoupon();
    }

//    @GetMapping("getJson")
//    public Coupon getDummyJson(){
//        return Coupon.builder()
//                .id(couponService.newCoupon())
//                .type("Voucher")
//                .validFor(3).build();
//    }

    @GetMapping("getMultipleCoupons")
    public List<String> newCouponWithQuantity(){
        int quantity = 10;
        return couponService.getNewCoupon(quantity);
    }

//    @GetMapping("getallcoupon")
//    public List<Coupon> getallcoupon(){
//        return couponService.getallpatient();
//    }
    // http://localhost:8082/app-name/coupon/getCoupon

    @PostMapping("/save_random_data/{value}")
    public List<Coupon> saveRandom(@PathVariable int value, @RequestBody Coupon coupon){
        return couponService.insertCoupon(value,coupon.getCategory(),coupon.getTitle());
    }
}
