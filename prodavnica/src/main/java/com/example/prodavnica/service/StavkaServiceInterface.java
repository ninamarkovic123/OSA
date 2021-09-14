package com.example.prodavnica.service;

import java.util.List;

import com.example.prodavnica.model.Stavka;

public interface StavkaServiceInterface {
	
	Stavka findOne(Long stavkaId);
	
	Stavka save(Stavka stavka);
	
	void remove(Long stavkaId);
	
	List<Stavka> findAll();
}
