package advanced;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import model.Customer;
import model.Person;

public class App {
 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("advancedBeans/advancedContext.xml"); 
		System.out.println("Hello World");
		Person person = (Person)context.getBean("person");
		System.out.println(person.getName() + " Hi!");
		System.out.println(person.getUsername() + " Hi!");
		System.out.println(person.getPassword());
		
		SessionFactory sessionfactory =  person.getSessionFactory();
		Session session = sessionfactory.openSession();
		
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
		criteria.from(Customer.class);
	        
		List<Customer> customers = session.createQuery(criteria).getResultList();
	        
	        for(Customer customer : customers ) { 
	        	System.out.println(customer.getCutomer_id()+","+
	        			customer.getCompanyName()+","+
	        			customer.getContactName()+","+
	        			customer.getContactTitle()+","+
	        			customer.getAddress()+","+
	        			customer.getCity()+","+
	        			customer.getPostalcode()+","+
	        			customer.getPhone()+","+
	        			customer.getFax()+","+
	        			customer.getCountry()+",");
	        }
	        System.out.println(" Size:  "+ customers.size());
	        
	        session.close();
//		
//		
//		//Close the Application Context
//		((ClassPathXmlApplicationContext)context).close();
		
		

	}

}
