package com.example.ecom.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecom.entities.Catalogue;
import com.example.ecom.entities.Produit;




@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
