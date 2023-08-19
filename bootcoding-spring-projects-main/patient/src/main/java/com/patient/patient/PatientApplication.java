package com.patient.patient;

import com.patient.patient.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientApplication  implements ApplicationRunner{

	public static void main(String[] args) {

		try {
			SpringApplication.run(PatientApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(" I am running!");
	}
}
