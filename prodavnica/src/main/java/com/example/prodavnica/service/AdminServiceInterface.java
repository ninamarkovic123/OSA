package com.example.prodavnica.service;

import java.util.List;

import com.example.prodavnica.model.Admin;

public interface AdminServiceInterface {
	Admin findOne(Long korisnikId);
	
	Admin save(Admin admin);
	
	void remove(Long korisnikId);
	
	List<Admin> findAll();
}
