package com.kushkumardhawan.test.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.repositories.PaymentRepository;
import entities.Check;
import entities.CreditCard;


@ActiveProfiles("dev")
@ContextConfiguration(locations ={"classpath:com/kushkumardhawan/test/config/datasource-jpa.xml"} )
@RunWith(SpringJUnit4ClassRunner.class)
public class PaymentTest {
	
	@Autowired
	PaymentRepository payment_repository;
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void createPayment() {
		CreditCard cc = new CreditCard();
		cc.setAmount(new Double(12345));
		cc.setCardcumber("123456789");
		
		
		payment_repository.save(cc);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void createCheckPayment() {
		Check cc = new Check();
		cc.setAmount(new Double(12345));
		cc.setChechnumber("0987654321");
		
		
		payment_repository.save(cc);
	}

	
	
}
