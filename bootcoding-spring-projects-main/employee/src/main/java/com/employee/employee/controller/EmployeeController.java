package com.employee.employee.controller;

import com.employee.employee.employee;
import com.employee.employee.service.employeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {
    @Autowired
    private employeService emp;

    @GetMapping("getemployee")
    public String newemploye(){return "New employee : " + employeService.newemployee();}

    @GetMapping("getJson")
    public employee getDummyJson(){
        return employee.builder()
                .id(employeService.newemployee())
                .Name("prathamesh")
                .salary(40000)
                .age(30)
                .build();
    }

//    @GetMapping("getMultipleCoupons")
//    public List<String> newCouponWithQuantity(){
//        int quantity = 10;
//        return employeService.getNewCoupon(quantity);
//    }

}
