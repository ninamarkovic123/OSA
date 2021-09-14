package com.example.prodavnica.service;

import java.util.List;

import com.example.prodavnica.model.Artikal;

public interface ArtikalServiceInterface {
	
	Artikal findOne(Long artikalId);
	
	Artikal save(Artikal artikal);
	
	void remove(Long artikalId);
	
	List<Artikal> findAll();
	
	List<Artikal> findAllByDeleted(Boolean deleted);
}
