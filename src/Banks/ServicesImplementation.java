package Banks;

import org.springframework.stereotype.Component;

import Interfaces.Services;

@Component("services")
public class ServicesImplementation implements Services {

	@Override
	public String healthService() {
		// TODO Auto-generated method stub
		return "Health Services Provided by this Bank";
	}

	@Override
	public String ppfService() {
		// TODO Auto-generated method stub
		return "PPF Service Provided by this bank";
	}

}
