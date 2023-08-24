package com.bootcoding.spring.coupon.Repository;

import com.bootcoding.spring.coupon.model.Coupon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon,Integer> {

}
