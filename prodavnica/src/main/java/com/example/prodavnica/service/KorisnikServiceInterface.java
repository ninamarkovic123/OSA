package com.example.prodavnica.service;

import java.util.List;

import com.example.prodavnica.model.Korisnik;

public interface KorisnikServiceInterface {

	Korisnik findOne(Long korisnikId);
	
	Korisnik save(Korisnik korisnik);
	
	void remove(Long korisnikId);
	
	List<Korisnik> findAll();
	
	Korisnik findByKorisnickoimeILozinka(String korisnickoime, String lozinka);
}
