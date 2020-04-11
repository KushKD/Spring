package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;



//@EnableTransactionManagement
@Component
public class Person {

	@Autowired
	@Value("${jdbc.username}")
	private String username;
	
	@Autowired
	@Value("${jdbc.password}")
	private String password;
	
	@Autowired
	private SessionFactory  sessionFactory;
	
//	
//	
//
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return "Kush Kumar Dhawan";
	}

}
