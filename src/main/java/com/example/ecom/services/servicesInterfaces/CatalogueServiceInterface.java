package com.example.ecom.services.servicesInterfaces;

import com.example.ecom.entities.Catalogue;
import com.example.ecom.entities.Categorie;
import com.example.ecom.entities.Produit;

public interface CatalogueServiceInterface {
	
	public Catalogue createCatalogue(Catalogue catalogue) throws Exception ;
	
	public Categorie createCategorie(Categorie categorie) throws Exception;
	
	public Produit createProduit(Produit produit) throws Exception;

}
