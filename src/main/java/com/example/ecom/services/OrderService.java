package com.example.ecom.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;


import org.springframework.transaction.annotation.Transactional;

import com.example.ecom.dao.CatalogueRepository;
import com.example.ecom.dao.CategorieRepository;
import com.example.ecom.dao.PanierRepository;
import com.example.ecom.dao.ProduitRepository;
import com.example.ecom.entities.Catalogue;
import com.example.ecom.entities.Categorie;
import com.example.ecom.entities.Panier;
import com.example.ecom.entities.Produit;
import com.example.ecom.services.servicesInterfaces.OrderServiceInterface;



@Service
public class OrderService implements OrderServiceInterface{
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private PanierRepository panierRepository;
	
	@Autowired
	private CatalogueRepository catalogueRepository;
	
	 // creation des paniers
		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
		public Panier createPanier(Panier panier)  throws Exception{
			double total=0.0;
			
			for(Produit produit: panier.getProduitList()) {
				if(produit!=null ) {
					total=total+produit.getPrix();
				}
			}
			
			panier.setTotal(total);
			
			return panierRepository.save(panier);
		}

		
		
	public double getTotalOfPanier(Long id) throws Exception {
			
		Panier panier=	panierRepository.findById(id).get();
			
			return panier.getTotal();
		}
		
		
	
	
	
	
	

}