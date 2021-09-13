package com.example.prodavnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.prodavnica.model.Prodavac;

@Repository
public interface ProdavacRepository extends JpaRepository<Prodavac, Long> {

}
