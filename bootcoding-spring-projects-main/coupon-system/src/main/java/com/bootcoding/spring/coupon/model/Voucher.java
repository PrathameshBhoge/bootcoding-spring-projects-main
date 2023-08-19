package com.bootcoding.spring.coupon.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Voucher {
    private String id;
    private int validFor;
    private String title;
    private String Category;
    private int discount;
}
