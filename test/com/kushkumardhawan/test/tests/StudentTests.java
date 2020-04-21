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

import dao.repositories.StudentRepository;
import entities.Student;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentTests {

	@Autowired
	private StudentRepository student_repository;


	@Test
	@Transactional
	@Rollback(false)
	public void addStudents() {
		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student("Kush","Dhawan",3000);
		Student student2 = new Student("Luv","Dhawan",3000);
		Student student3 = new Student("Minki","Dhawan",3000);
		Student student4 = new Student("Pardeep","Dhawan",3000);
		Student student5 = new Student("Vandana","Dhawan",3000);
		Student student6 = new Student("Kailash","Dhawan",3000);
		Student student7 = new Student("Gyan","Dhawan",3000);
		Student student8 = new Student("Chanchal","Dhawan",3000);
		Student student9 = new Student("Tamanna","Dhawan",3000);
		students.add(student1);students.add(student2);students.add(student3);students.add(student4);students.add(student5);students.add(student6);
		students.add(student7);students.add(student8); students.add(student9);
		
		student_repository.saveAll(students);
	}

	@Test
	public void getAllStudents() {
		
		System.err.println(student_repository.findAllStudents());
	}
	
	@Test
	public void getPartialDataStudents() {
		System.err.println(student_repository.findAllPartialStudentsData());
	}
	
	@Test
	public void getPartialDataStudentsByFirstName() {
		System.err.println(student_repository.findAllStudentsByFirstName("Kush").toString());
	}
	

}
