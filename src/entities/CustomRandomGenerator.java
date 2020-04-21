package entities;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomRandomGenerator implements IdentifierGenerator {

	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		Integer id = null;
		Random rm = new Random();
		id = rm.nextInt(1000000); 
		
		return  id;
	}

}
