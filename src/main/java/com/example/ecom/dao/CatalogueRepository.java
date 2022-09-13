package com.example.ecom.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecom.entities.Catalogue;




@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue, Long> {

}
