package com.bootcoding.spring.coupon.service;

import com.bootcoding.spring.coupon.model.Coupon;
import com.bootcoding.spring.coupon.model.Voucher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
@Service
public class VoucherService {
 public Voucher newVoucher(){
     return Voucher.builder()
             .id(UUID.randomUUID().toString())
             .validFor(5 + new Random().nextInt(90))
             .title("Voucher")
             .Category("Voucher")
             .discount(5+ new Random().nextInt(100))
             .build();
 }

}

