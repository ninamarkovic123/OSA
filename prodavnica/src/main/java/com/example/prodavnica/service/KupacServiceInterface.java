package com.example.prodavnica.service;

import java.util.List;

import com.example.prodavnica.model.Kupac;

public interface KupacServiceInterface {
	
	Kupac findOne(Long kupacId);
	
	Kupac save(Kupac kupac);
	
	void remove(Long kupacId);
	
	List<Kupac> findAll();
}
