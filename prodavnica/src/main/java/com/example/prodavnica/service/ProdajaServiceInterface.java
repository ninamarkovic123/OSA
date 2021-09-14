package com.example.prodavnica.service;

import java.util.List;

import com.example.prodavnica.model.Prodaja;

public interface ProdajaServiceInterface {

	Prodaja findOne(Long prodajaId);
	
	Prodaja save(Prodaja prodaja);
	
	void remove(Long prodajaId);
	
	List<Prodaja> findAll();
	
}
