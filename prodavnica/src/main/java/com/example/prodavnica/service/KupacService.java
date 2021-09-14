package com.example.prodavnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prodavnica.model.Kupac;
import com.example.prodavnica.repository.KupacRepository;

@Service
public class KupacService implements KupacServiceInterface {

	@Autowired
	KupacRepository repo;
	
	@Override
	public Kupac findOne(Long kupacId) {
		return repo.getOne(kupacId);
	}

	@Override
	public Kupac save(Kupac kupac) {
		return repo.save(kupac);
	}

	@Override
	public void remove(Long kupacId) {
		repo.deleteById(kupacId);
	}

	@Override
	public List<Kupac> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
