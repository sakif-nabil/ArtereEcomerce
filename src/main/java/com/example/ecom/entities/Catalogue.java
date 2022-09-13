package com.example.ecom.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Catalogue implements Serializable {

	
	    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  
	    @OneToMany(mappedBy = "catalogue")
	    private List<Categorie> categorielist;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<Categorie> getCategorielist() {
			return categorielist;
		}

		public void setCategorielist(List<Categorie> categorielist) {
			this.categorielist = categorielist;
		}
	    
	    
	    
	    


		
	    
	    
	    
	    
	   

}
