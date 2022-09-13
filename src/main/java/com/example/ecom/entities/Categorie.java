package com.example.ecom.entities;



import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {

	
	    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nom;
	    private String description;
	    
	    @ManyToOne
	    private Categorie categorieParent;
	    
	    @ManyToOne
	    private Catalogue catalogue;
	    
	    @OneToMany(mappedBy = "categorie")
	    private List<Produit> produitlist;
	    
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
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Categorie getCategorieParent() {
			return categorieParent;
		}
		public void setCategorieParent(Categorie categorieParent) {
			this.categorieParent = categorieParent;
		}
		public Catalogue getCatalogue() {
			return catalogue;
		}
		public void setCatalogue(Catalogue catalogue) {
			this.catalogue = catalogue;
		}
		public List<Produit> getProduitlist() {
			return produitlist;
		}
		public void setProduitlist(List<Produit> produitlist) {
			this.produitlist = produitlist;
		}
	    
	    
	   
	   
	   

}
