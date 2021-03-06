package com.example.prodavnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prodavnica.model.Artikal;
import com.example.prodavnica.repository.ArtikalRepository;

@Service
public class ArtikalService implements ArtikalServiceInterface{
	
	@Autowired
	ArtikalRepository artikalRepository;

	

	@Override
	public Artikal findOne(Long artikalId) {
		return artikalRepository.getOne(artikalId);
	}

	@Override
	public Artikal save(Artikal artikal) {
		
		return artikalRepository.save(artikal);
	}

	@Override
	public void remove(Long artikalId) {
		artikalRepository.deleteById(artikalId);
	}

	@Override
	public List<Artikal> findAll() {
		return artikalRepository.findAll();
	}

	@Override
	public List<Artikal> findAllByDeleted(Boolean deleted) {
		return artikalRepository.findAllByDeleted(deleted);
	}

}
