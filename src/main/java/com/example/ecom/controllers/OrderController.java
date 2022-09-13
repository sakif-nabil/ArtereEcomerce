package com.example.ecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom.entities.Catalogue;
import com.example.ecom.entities.Categorie;
import com.example.ecom.entities.Panier;
import com.example.ecom.entities.Produit;
import com.example.ecom.services.CatalogueService;
import com.example.ecom.services.OrderService;

@CrossOrigin("*")
@RestController
public class OrderController {

	@Autowired
	private  OrderService orderService;
	

	
	

	 @PostMapping("/panier")
	 public ResponseEntity<Long> createPanier(@RequestBody Panier panier) throws Exception{
	        
	        
		 Panier newPanier= orderService.createPanier(panier);
		 
			return new ResponseEntity<Long>(newPanier.getId(), HttpStatus.CREATED);
	   }
	 
	 @GetMapping("/panier/{id}")
	 public ResponseEntity<Double> getTotalOfPanier(@PathVariable("id") Long id) throws Exception{
	        
	        
		 double total= orderService.getTotalOfPanier(id);
		 
			return new ResponseEntity<Double>(total, HttpStatus.OK);
	   }
	 
	 
	 
	 
	
	
	
}