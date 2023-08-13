package com.employee.employee;

import com.employee.employee.service.employeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Autowired
	private employeService employeService;

	public void run(ApplicationArguments args) throws Exception {
		String s = employeService.newemployee();
		System.out.println("New employee : " + s);
	}
}
