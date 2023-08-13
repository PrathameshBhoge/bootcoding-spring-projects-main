package com.employee.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class employeService {
    public static   String newemployee(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public List<String> getNewCoupon(int quantity){
        List<String> employee = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            String newemployee = newemployee();
            employee.add(newemployee);
        }
        return employee;

    }

}
