package com.example.ecom.services;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;


import org.springframework.transaction.annotation.Transactional;

import com.example.ecom.dao.CatalogueRepository;
import com.example.ecom.dao.CategorieRepository;
import com.example.ecom.dao.ProduitRepository;
import com.example.ecom.entities.Catalogue;
import com.example.ecom.entities.Categorie;
import com.example.ecom.entities.Produit;
import com.example.ecom.services.servicesInterfaces.CatalogueServiceInterface;



@Service
public class CatalogueService implements CatalogueServiceInterface {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private CatalogueRepository catalogueRepository;
	
	 // creation des catalogues
		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
		public Catalogue createCatalogue(Catalogue catalogue) throws Exception {
			return catalogueRepository.save(catalogue);
		}
	
	 // creation des categories
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public Categorie createCategorie(Categorie categorie) throws Exception {
		return categorieRepository.save(categorie);
	}


	 // creation des produits
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public Produit createProduit(Produit produit) throws Exception {
		return produitRepository.save(produit);
	}
	
	
	

}