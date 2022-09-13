package com.example.ecom.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit implements Serializable {

	
	    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nom;
	    private double prix;
	    private double quantite;
	    
	    @ManyToOne
	    private Categorie categorie;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public double getPrix() {
			return prix;
		}
		public void setPrix(double prix) {
			this.prix = prix;
		}
		public Categorie getCategorie() {
			return categorie;
		}
		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}
		public double getQuantite() {
			return quantite;
		}
		public void setQuantite(double quantite) {
			this.quantite = quantite;
		}
	
		


	    
	    
	   
	   
	   

}
