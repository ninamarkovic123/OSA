package com.example.prodavnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prodavnica.model.Kupac;

@Repository
public interface KupacRepository extends JpaRepository<Kupac, Long> {

}
