package com.kushkumardhawan.test.tests;

import static org.junit.Assert.*;

import org.hamcrest.Factory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.OfferDaoImpl;
import dao.repositories.ProductRepository;
import entities.Offers;
import entities.Products;
import model.Offer;

@ActiveProfiles("dev")
@ContextConfiguration(locations = {  "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductTests {

	
	@Autowired
	private ProductRepository product_repository;

//	@Before
//	public void init() {
//		
//	}

	@Test
	public void testcreateProduct() {

		Products product = new Products("IBM2", "CRUD", "80,000");

		product_repository.save(product);

	}

}
