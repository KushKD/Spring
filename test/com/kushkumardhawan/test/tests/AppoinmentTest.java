package com.kushkumardhawan.test.tests;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;

import dao.repositories.AppoinmentsRepository;
import dao.repositories.DoctorRepository;
import dao.repositories.PatientRepository;
import dao.repositories.StudentRepository;
import entities.Appoinments;
import entities.Doctors;
import entities.Patients;
import entities.Student;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AppoinmentTest  {

	@Autowired
	private PatientRepository patient_repository;

	@Autowired
	private DoctorRepository doctor_repository;
	
	@Autowired
	private AppoinmentsRepository appoinmnet_repository;

	@Test
	@Transactional
	@Rollback(false)
	public void createAppoinment() {

		Appoinments appoinments = new Appoinments();
		Timestamp appoinmentTime = new Timestamp(new Date().getTime());
		appoinments.setAppoinmentTime(appoinmentTime); 
		appoinments.setStarted(true);
		appoinments.setPatient(patient_repository.findById(2).get());
		appoinments.setDoctor(doctor_repository.findById(1).get());
		
		appoinmnet_repository.save(appoinments);
		
	}

	
	
}
