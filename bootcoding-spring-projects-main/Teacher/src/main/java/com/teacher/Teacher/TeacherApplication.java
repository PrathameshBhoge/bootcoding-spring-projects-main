package com.teacher.Teacher;

import com.teacher.Teacher.service.teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeacherApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(TeacherApplication.class, args);
	}

	@Autowired
	private teacherservice teacherService;

	public void run(ApplicationArguments args) throws Exception{
		String s =teacherservice.newteacher();
		System.out.println("New Teacher: "+s );
	}
}
