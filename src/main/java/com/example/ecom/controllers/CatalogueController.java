package com.example.ecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom.entities.Catalogue;
import com.example.ecom.entities.Categorie;
import com.example.ecom.entities.Produit;
import com.example.ecom.services.CatalogueService;

@CrossOrigin("*")
@RestController
public class CatalogueController {

	@Autowired
	private CatalogueService catalogueService;
	

	
	

	 @PostMapping("/catalogue")
	 public ResponseEntity<Long> createCatalogue(@RequestBody Catalogue catalogue) throws Exception{
	        
	        
		 Catalogue newCatalogue= catalogueService.createCatalogue(catalogue);
		 
			return new ResponseEntity<Long>(newCatalogue.getId(), HttpStatus.CREATED);
	   }
	 
	 @PostMapping("/categorie")
	 public ResponseEntity<Long> createCategorie(@RequestBody Categorie categorie) throws Exception{
	        
	        
		 Categorie newCategorie= catalogueService.createCategorie(categorie);
		 
			return new ResponseEntity<Long>(newCategorie.getId(), HttpStatus.CREATED);
	   }
	 
	 @PostMapping("/catalogue")
	 public ResponseEntity<Long> createProduit(@RequestBody Produit produit) throws Exception{
	        
	        
		 Produit newProduit= catalogueService.createProduit(produit);
		 
			return new ResponseEntity<Long>(newProduit.getId(), HttpStatus.CREATED);
	   }
	 
	 
	
	
	
}