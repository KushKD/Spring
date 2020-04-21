package com.kushkumardhawan.test.tests;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.repositories.FruitsRepository;
import entities.Fruits;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class FruitsTests {

	@Autowired
	private FruitsRepository fruit_repository;


	@Test
	public void testcreateFruit() {

		Fruits fruit = new Fruits( "Banana", "Makes you always laugh !!");
		fruit_repository.save(fruit);
		System.out.println(fruit_repository.save(fruit));
		
	}
	
	
	
	
	  @Test public void testFruitsByName() { 
		  List<Fruits> fruits = fruit_repository.findByFruitname("Pulm");
		  fruits.forEach(f->System.out.println(f.getFruit_desc())); 
		  
		  System.err.println(fruits.get(0).getFruit_desc());
	  
	  }
	  
	  @Test public void testFruitsByNameAndDesc() { 
		  List<Fruits> fruits = fruit_repository.findByFruitnameAndFruitdesc("Pulm", "Nippa Virus Man");
		  fruits.forEach(f->System.out.println(f.getFruit_desc())); 
		  System.err.println(fruits.get(0).getFruit_desc());
	  
	  }
	  
	  @Test public void testFruitsContains() { 
		  List<Fruits> fruits = fruit_repository.findByFruitdescContains("Nippa");
		  fruits.forEach(f->System.out.println(f.getFruit_desc())); 
		  System.err.println(fruits.get(0).getFruit_desc());
	  
	  }
	 
	

}
