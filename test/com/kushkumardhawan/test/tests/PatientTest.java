package com.kushkumardhawan.test.tests;

import java.util.ArrayList;
import java.util.Arrays;
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

import dao.repositories.DoctorRepository;
import dao.repositories.PatientRepository;
import dao.repositories.StudentRepository;
import entities.Doctors;
import entities.Patients;
import entities.Student;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class PatientTest {

	@Autowired
	private PatientRepository patient_repository;

	@Autowired
	private DoctorRepository doctor_repository;

	@Test
	@Transactional
	@Rollback(false)
	public void createPatient() {

//		Patients patients = new Patients();
//		patients.setFirstName("Kush");
//		patients.setLastName("Dhawan");
//
//		Optional<Doctors> doctor = doctor_repository.findById(1);
//
//		List<Doctors> list = new ArrayList<Doctors>();
//		list.add(doctor.get());
//
//		patients.setDoctors_(list);
//		patient_repository.save(patients);
		System.out.println("sdsdssdfdsfdsfdsfdsfd"+patient_repository.findById(2).get().getFirstName());
	}

	@Test
	public void deletePatient() {

		patient_repository.deleteById(1);
	}

}
