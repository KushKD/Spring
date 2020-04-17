package controllers;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.OfferDao;
import dao.OfferDaoImpl;
import entities.Address;
import entities.Name;
import entities.Offers;
import entities.Roles;
import entities.User;
import model.Offer;
import model.UserPojo;

@Controller 
public class HomeController {
	
	private static Logger logger = Logger.getLogger(HomeController.class);
	
	@Autowired
	OfferDaoImpl offerDao;
	
	public OfferDao getOfferDao() {
		return offerDao;
	}

	public void setOfferDao(OfferDaoImpl offerDao) {
		this.offerDao = offerDao;
	}


	@RequestMapping(method = RequestMethod.GET, value = "/show" )
	public String showHome(Model mv) {
		
		
		List<Offers> list = offerDao.getOffers();
		mv.addAttribute("offers", list);
		
		return "showOffers";
	}
	
	
//	@RequestMapping( method = RequestMethod.GET , value="/moffers", produces = "application/json")
//	//@GetMapping(value="/moffers")
//	public ResponseEntity<?> getOffers(){
//		//Map<String, Object>
//		
//		  Map<String,Object> map = new HashMap<String, Object>();
//		  map.put("Kush Dhawan", "Json");System.out.println("We are here moffers");
//		 
//		return ResponseEntity.ok(map);
//	}
	
	@RequestMapping( method = RequestMethod.GET , value="/moffers", produces = "application/json")
	public Map<String, Object> getOffers(){
		
		  Map<String,Object> map = new HashMap<String, Object>();
		  map.put("Kush Dhawan", "Json");System.out.println("We are here moffers");
		 
		return map;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/root" )
	public String showRoot(Model mv) {
	
		
		return "root";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/admin" )
	public String showAdmin(Model mv) {
	
		logger.debug("Show the Admin PAfe . We are Inside teh Home Controller");
		return "admin";
	}
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/" )
	public String showHome(HttpSession session ) {
		logger.debug("Show the MAin PAge . We are Inside teh Home Controller");
		session.setAttribute("name", "kush from Controlller");
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/create" )
	public String createHome(Model mv , Principal principal) {
		mv.addAttribute("offer", new Offer());
		System.out.println(principal.getName());  //Getting the Username of the logged in user
		
		return "createOffer";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/createOffer" )
	public String createOffer(Model mv, @Valid Offer offer , BindingResult result ) {
		System.out.println(offer.toString());
		
		if(result.hasErrors()) {
			System.out.println("Form does not Validate");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError objectError : errors) {
				System.out.println(objectError);
				
			}
			return "createOffer";
		}
		//Save the code goes here
		//Set form to Bean
		//Save bean to hibernate
		offerDao.saveOffer(offer);
		//mv.addAttribute("ID", id);
		return "offerCreated";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register" )
	public String createUserReg(Model mv) {
		mv.addAttribute("userpojo", new UserPojo());
		return "createUser";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/createUser" )
	public String createUser(Model mv, @Valid @ModelAttribute("userpojo") UserPojo userpojo , BindingResult result ) throws ParseException {
		
		userpojo.setCreatedDate("15-04-2020");
		userpojo.setIsactive(true);
		
		System.out.println(userpojo.toString());
		
		if(result.hasErrors()) {
			System.out.println("Form does not Validate");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError objectError : errors) {
				System.out.println(objectError);
				
			}
			return "createUser";
		}
		//result.rejectValue("username", "DuplicatKey.userpojo.username");
		User user = new User();
		Name  name = new Name();
		name.setFirstName(userpojo.getFirstname());
		name.setLastName(userpojo.getLastname());
		name.setMiddleName(userpojo.getMiddlename());
		user.setName(name);
		Address address = new Address();
		address.setAddress(userpojo.getAddress());
		address.setCity(userpojo.getCity());
		address.setDistrict(userpojo.getDistrict());
		address.setState(userpojo.getState());
		user.setAddress(address);
		
		user.setCreated_date(modifyDateLayout(userpojo.getCreatedDate()));
		user.setIsActive(userpojo.getIsactive());
		user.setUsername(userpojo.getUsername());
		user.setPassword(userpojo.getPasword());
		
		Roles roles = new Roles();
		roles.setCreatedDate(modifyDateLayout(userpojo.getCreatedDate()));  
		roles.setRollDescription(userpojo.getRole_description());
		roles.setRollName(userpojo.getRol_name());
		
		
		offerDao.saveUser(user, roles); 
		
	
		
		return "userCreated";
	}
	
	
	
	
	Date modifyDateLayout(String inputDate) throws ParseException{
	    Date date = new SimpleDateFormat("dd-MM-yyyy").parse(inputDate);
	    return date;
	}
	
	

}
