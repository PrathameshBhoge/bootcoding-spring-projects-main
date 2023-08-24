package com.bootcoding.spring.coupon.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@Table(name = "Coupon")
@Entity
public class Coupon {
   @Id
   @GeneratedValue
   private int id;
   private String title;
   @Column(name="coupon_type")
   private String type;
   private String description;
   @Column(name="coupon_code")
   private  String couponcode;
   @Column(name= "validity_date")
   private Date validitydate;
   private int discount;
   private String category;
   @Column(name="create_date")
   private Date createDate;
   private String createdby;
   private boolean isactive;
   private String status;

}
