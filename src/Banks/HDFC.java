package Banks;

import org.springframework.stereotype.Component;

import Interfaces.IBank;

@Component("hdfc")
public class HDFC implements IBank {

	@Override
	public String getSavingsAccountDetails() {
		// TODO Auto-generated method stub
		return "Luv was working in HDFC Previously";
	}

	@Override
	public String bankLocation() {
		// TODO Auto-generated method stub
		return "This Bank is now Shifted to LakkarBazar";
	}

}
