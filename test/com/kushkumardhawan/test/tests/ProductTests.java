package com.kushkumardhawan.test.tests;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

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
@ContextConfiguration(locations = { "classpath:com/kushkumardhawan/test/config/datasource-jpa.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductTests {

	@Autowired
	private ProductRepository product_repository;


	@Test
	public void testcreateProduct() {

		Products product = new Products("SEX", "CRUD", "80,000");
		product_repository.save(product);
		System.out.println(product_repository.save(product));
		
	}
	
	@Test
	public void teatReadProduct() {
		Optional<Products> product= product_repository.findById(3);
		System.out.println(product.toString());
		Products product_server = product.get();
		product_server.setName("Drake");
		product_repository.save(product_server);
		
	}
	
	@Test
	public void testReadAllProducts() {
		List<Products> products= (List<Products>) product_repository.findAll();
		System.err.println("Size is:-" + products.size());
	}
	
	@Test
	public void testDeleteProducts() {
		if(product_repository.existsById(3)) {
			System.out.println("ID with 3 Found");
		product_repository.deleteById(3);
		}
		System.out.println(product_repository.count()+"  @#@#@#@#@");
	}

	

}
