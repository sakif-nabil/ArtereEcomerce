package com.example.ecom.entities;



import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.JoinColumn;


@Entity
public class Panier implements Serializable {

	
	    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	   
	    private double total;
	    
	    @ManyToMany
	    @JoinTable(
	      name = "bon_materiel", 
	      joinColumns = @JoinColumn(name = "panier_id"), 
	      inverseJoinColumns = @JoinColumn(name = "produit_id"))
	    private List<Produit> produitList;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public List<Produit> getProduitList() {
			return produitList;
		}

		public void setProduitList(List<Produit> produitList) {
			this.produitList = produitList;
		}

		
	    
	    
	    
	    
	    
	    
	    
	   
	   
	   

}
