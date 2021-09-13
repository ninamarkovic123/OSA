package com.example.prodavnica.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.prodavnica.model.Porudzbina;

@Repository
public interface PorudzbinaRepository extends JpaRepository<Porudzbina, Long> {

}
