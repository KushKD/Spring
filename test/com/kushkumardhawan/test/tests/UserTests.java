package com.kushkumardhawan.test.tests;

import static org.junit.Assert.*;

import org.hamcrest.Factory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.OfferDaoImpl;
import entities.Offers;
import model.Offer;

@ActiveProfiles("dev")
@ContextConfiguration(locations ={"classpath:advancedBeans/dao-context.xml",
								  "classpath:advancedBeans/security-context.xml" ,
								  "classpath:com/kushkumardhawan/test/config/datasource.xml"} )
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTests {
	
	@Autowired
	private OfferDaoImpl offers;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Before
	public void init() {
		Session session = sessionFactory.openSession(); 
	}
	
	@Test
	public void testCreateOffer() {
		//assertEquals("Chamba", "1", "1");
		Offer offer = new Offer("KKDhawan","kushkumardhawan@email,com","Dummy Text","India Himachal Pradesh");
		assertTrue("Offer Creation Should Return True", offers.saveOffer(offer));
		
		//offers
	}

	
	
}
