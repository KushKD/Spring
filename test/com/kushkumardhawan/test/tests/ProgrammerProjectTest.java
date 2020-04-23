package com.kushkumardhawan.test.tests;



import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import dao.repositories.ProjectsProgrammersRepository;
import entities.Programmer;
import entities.Projects;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ProgrammerProjectTest {
	
	@Autowired
	ProjectsProgrammersRepository repository;
	
	@Test
	public void createEmployee() {
		
		Programmer programmer = new Programmer();
		programmer.setName("Leasner");
		programmer.setSalary(2200000);
		
		HashSet<Projects> projects = new HashSet<Projects>();
		
		Projects project = new Projects();
		project.setName("UCFA");
		projects.add(project);
		
		Projects project2 = new Projects();
		project2.setName("WWE");
		projects.add(project2);
		
		programmer.setProjects(projects); 
		
		repository.save(programmer);
		
		
	}

	
	
}
