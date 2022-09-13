package com.example.ecom.services.servicesInterfaces;

import com.example.ecom.entities.Panier;

public interface OrderServiceInterface {

	
	public Panier createPanier(Panier panier)  throws Exception;
	
	public double getTotalOfPanier(Long id) throws Exception ;
}
