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
	public List<Offers> getOffers() {
		Session session = sessionFactory.openSession();
		
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Offers> criteria = builder.createQuery(Offers.class);
		criteria.from(Offers.class);
	        
		List<Offers> offers = session.createQuery(criteria).getResultList();
		return offers;
	}

	@Override
	public void saveOffer(Offer offer) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Offers offers = new Offers();
		offers.setEmail(offer.getEmail());
		offers.setLocation(offer.getLocation());
		offers.setName(offer.getName());
		session.save(offers);
		session.getTransaction().commit();
		session.close();
		
		
	}
	
	

}
