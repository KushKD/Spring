package Banks;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import Interfaces.IBank;

@Component("obc")
//@Qualifier("services")
public class OBC implements IBank , Serializable {
	
	
	private ServicesImplementation obcServices;
	
	

	public ServicesImplementation getObcServices() {
		return obcServices;
	}

	@Autowired
	public void setObcServices(ServicesImplementation obcServices) {
		this.obcServices = obcServices;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2796806416107663378L;

	@Override
	public String getSavingsAccountDetails() {
		// TODO Auto-generated method stub
		return "Currently Less Money In Kush / Luv Dhawan Account.";
	}

	@Override
	public String bankLocation() {
		// TODO Auto-generated method stub
		return "Shimla Lower Bazar";
	}
	
	String showServices() {
		
		return obcServices.healthService() +","+ obcServices.ppfService();
	}

}
