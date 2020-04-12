package controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.Customer;
import dao.OfferDao;
import dao.OfferDaoImpl;

@Controller 
public class HomeController {
	
	@Autowired
	OfferDaoImpl offerDao;
	
	
	
//	@RequestMapping(method = RequestMethod.GET, value = "/" )
//	public String showHome(HttpSession session ) {
//		session.setAttribute("name", "kush from Controlller");
//		return "index";
//	}
	
	
	public OfferDao getOfferDao() {
		return offerDao;
	}



	public void setOfferDao(OfferDaoImpl offerDao) {
		this.offerDao = offerDao;
	}



	@RequestMapping(method = RequestMethod.GET, value = "/" )
	public ModelAndView showHome() {
		
		ModelAndView mv = new ModelAndView("index");  //the view which we want to display
		
		List<Customer> list = offerDao.getOffers();
		System.out.println(" Size:  "+ list.size());
		
		Map<String,Object> model = mv.getModel();
		model.put("name", "River Kush");
		
		return mv;
	}
	

}
