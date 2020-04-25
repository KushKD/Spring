package com.kushkumardhawan.test.tests;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import dao.repositories.DoctorRepository;
import dao.repositories.StudentRepository;
import entities.Doctors;
import entities.Student;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class DoctorTest {

	@Autowired
	private DoctorRepository doctor_repository;


	@Test
	@Transactional
	@Rollback(false)
	public void createDoctor() {
		
		Doctors doctors = new Doctors();
		doctors.setFirstName("Rakesh");
		doctors.setLastName("Marwaha");
		doctors.setSpecialist("Ortho");
		
		
		doctor_repository.save(doctors);
		
		//System.out.println(doctor_repository.findById(1).get().toString());
	}

	
	
	

}
