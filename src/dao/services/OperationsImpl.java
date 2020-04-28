package dao.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.OfferDao;
import entities.Offers;
import model.Offer;

public class OperationsImpl implements Operations {

	

	@Override
	public List<Offers> add(int a, int b) {
		// TODO Auto-generated method stub
		List<Offers> offers = new ArrayList<Offers>();
		Offers offer = new Offers();
		offer.setId(200);
		offer.setEmail("kushkumardhawan@gmail.com");
		offer.setLocation("Shimla");
		offer.setName("kush kumar dhawan");
		offers.add(offer);
		
		return  offers;
	}

}
