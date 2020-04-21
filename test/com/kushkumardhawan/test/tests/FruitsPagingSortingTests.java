package com.kushkumardhawan.test.tests;


import java.util.List;

import javax.naming.ldap.SortControl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.repositories.FruitsRepository;
import dao.repositories.FruitsRepositoryPagingSorting;
import entities.Fruits;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class FruitsPagingSortingTests {


	@Autowired
	private FruitsRepositoryPagingSorting paging_sorting;


	
	  @Test
	  public void testFinaAllPaging() {
		  
		  //Page we want to access  Pages start with Zero
		  //2nd size how many records we want in page
		  paging_sorting.findAll(PageRequest.of(1, 2)).forEach(f-> System.out.println(f.getFruit_name()+"  " + f.getId()));
		 
	  }
	  
	  @Test
	  public void testFinaAllSorting() {
		 
		  paging_sorting.findAll(Sort.by("fruitname")).forEach(f->System.err.println(f.getFruit_name()));
		  System.out.println("\n \n");
		  paging_sorting.findAll(Sort.by("fruitname","fruitdesc")).forEach(f->System.err.println(f.getFruit_desc()));
	  }
	 
	

}
