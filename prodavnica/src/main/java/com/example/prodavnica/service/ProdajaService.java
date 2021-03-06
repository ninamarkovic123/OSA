package com.example.prodavnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prodavnica.model.Prodaja;
import com.example.prodavnica.repository.ProdajaRepository;

@Service
public class ProdajaService implements ProdajaServiceInterface {

	@Autowired
	ProdajaRepository repop;
	
	@Override
	public Prodaja findOne(Long prodajaId) {
		return repop.getOne(prodajaId);
	}

	@Override
	public Prodaja save(Prodaja prodaja) {
		return repop.save(prodaja);
	}

	@Override
	public void remove(Long prodajaId) {
		repop.deleteById(prodajaId);
	}

	@Override
	public List<Prodaja> findAll() {
		return repop.findAll();
	}

}
