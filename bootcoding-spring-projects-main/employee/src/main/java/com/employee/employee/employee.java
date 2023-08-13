package com.employee.employee;

import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class employee {
    private String id;
    private String Name;
    private float salary;
    private int age;


}
