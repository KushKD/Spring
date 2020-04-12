package dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import model.Offer;

@Component
public class OfferDaoImpl implements  OfferDao {
	
	@Autowired
	@Value("${jdbc.username}")
	private String username;
	
	@Autowired
	@Value("${jdbc.password}")
	private String password;
	
	@Autowired
	private SessionFactory  sessionFactory;
	
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
	

	public OfferDaoImpl() {
		super();
		System.out.println("Successfully Loaded Offers DaoImpl");
	}

	@Override
	public List<Customer> getOffers() {
		Session session = sessionFactory.openSession();
		
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
		criteria.from(Customer.class);
	        
		List<Customer> customers = session.createQuery(criteria).getResultList();
		return customers;
	}
	
	

}
