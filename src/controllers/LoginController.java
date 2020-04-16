package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET) 
	public String showLogin() {
		System.out.println("We are Here");		
		return "login";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET) 
	public String showLogout() {
		System.out.println("We are Here in Logout");		
		return "loggedout";
	}
}
