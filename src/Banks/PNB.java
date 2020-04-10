package Banks;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import Interfaces.IBank;

@Component("pnb")
public class PNB implements IBank,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5241877226709600695L;
	
	
	private String friends;
	
	
	
	

	public String getFriends() {
		return friends;
	}



	@Autowired
	@Value("Sidhaart Jareet")
	public void setFriends(String friends) {
		this.friends = friends;
	}



	@Override
	public String getSavingsAccountDetails() {
		// TODO Auto-generated method stub
		return "Kush has No account in PNB";
	}



	@Override
	public String bankLocation() {
		// TODO Auto-generated method stub
		return "Shima Mall Road";
	}

}
