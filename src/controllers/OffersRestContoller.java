package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dao.OfferDao;
import dao.OfferDaoImpl;
import entities.Offers;

@RestController
public class OffersRestContoller {
	
	
	@Autowired
	OfferDaoImpl offerDao;
	
	public OfferDao getOfferDao() {
		return offerDao;
	}

	public void setOfferDao(OfferDaoImpl offerDao) {
		this.offerDao = offerDao;
	}

	@RequestMapping( method = RequestMethod.GET , value="/moffers", produces = "application/json")
	public ResponseEntity<?> getOffers(){
		HttpHeaders headers = new HttpHeaders();
		
		List<Offers> offers = offerDao.getOffers();
		
		if(!offers.isEmpty()) {
			 Map<String,Object> map = new HashMap<String, Object>();
			 
			  map.put("Response",offers);
			  map.put("Headers", headers);
			  map.put("STATUS", HttpStatus.OK);
			  System.out.println("We are here moffers");
			  return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK); 
		}else {
			 Map<String,Object> map = new HashMap<String, Object>();
			 
			  map.put("Response","");
			  map.put("Headers", headers);
			  map.put("STATUS", HttpStatus.NO_CONTENT);
			  System.out.println("We are here moffers");
			  return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK); 
		}
		
		 
		 
		
	}
	
	
}
