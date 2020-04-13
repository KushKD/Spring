package controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.Customer;
import dao.OfferDao;
import dao.OfferDaoImpl;
import dao.Offers;
import model.Offer;

@Controller 
public class HomeController {
	
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
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/" )
	public String showHome(HttpSession session ) {
		session.setAttribute("name", "kush from Controlller");
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/create" )
	public String createHome(Model mv) {
		mv.addAttribute("offer", new Offers());
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
	
	

}
