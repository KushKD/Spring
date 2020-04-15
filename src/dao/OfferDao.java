package dao;

import java.util.List;

import entities.Offers;
import entities.Roles;
import entities.User;
import model.Offer;

public interface OfferDao {
	
	List<Offers> getOffers();
	void saveOffer(Offer offer);
	void saveUser(User user, Roles roles);

}
