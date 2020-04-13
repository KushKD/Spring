package dao;

import java.util.List;

import model.Offer;

public interface OfferDao {
	
	List<Offers> getOffers();
	void saveOffer(Offer offer);

}
