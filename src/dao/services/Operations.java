package dao.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import entities.Offers;


@WebService
public interface Operations {
	
	@WebMethod
	public @WebResult(name="response") List<Offers> add(int a, int b);

}
