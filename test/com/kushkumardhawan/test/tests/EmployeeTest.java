package com.kushkumardhawan.test.tests;



import java.util.Optional;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import dao.repositories.EmployeeRepository;
import entities.ContactDetails;
import entities.Employee;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeTest {
	
	@Autowired
	EmployeeRepository employee_repository;
	
	@Test
	public void createEmployee() {
		Employee employee =  new Employee();
		employee.setName("Kush Kumar Dhawan");
		
		
		ContactDetails phoneNumbers1 = new ContactDetails();
		phoneNumbers1.setNumber("9456619235");
		phoneNumbers1.setType("Mobile");
		
		ContactDetails phoneNumbers2 = new ContactDetails();
		phoneNumbers2.setNumber("1772657651");
		phoneNumbers2.setType("Land Line");
		
		employee.addContactDetails(phoneNumbers1);
		employee.addContactDetails(phoneNumbers2);
		
		
		employee_repository.save(employee);
	}

	@Test
	@Transactional
	//@Rollback(value = false)
	public void loadCustomer() {
		Optional<Employee> employee = employee_repository.findById(2);
		System.err.println(employee.get());
		System.err.println(employee.get().getContactDetails());
	}
	
	@Test
	@Transactional
	@Rollback(value = false)
	public void updateCustomer() {
		Optional<Employee> employee = employee_repository.findById(2);
		employee.get().setName("Mayank Kumar Dhawan");
		
		Set<ContactDetails> details = employee.get().getContactDetails();
		details.forEach(cd->cd.setType("Intercom"));
		
		employee_repository.save(employee.get());
	}
	
	@Test
	public void DeleteCustomer() {
		employee_repository.deleteById(1);
		
	}
	
}
