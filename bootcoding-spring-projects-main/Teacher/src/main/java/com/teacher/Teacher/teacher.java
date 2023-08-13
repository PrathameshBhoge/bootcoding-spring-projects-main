package com.teacher.Teacher;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class teacher {
   private int id;
   private String name;
   private String Department;
   private String Position;
   private float Salary;

}
