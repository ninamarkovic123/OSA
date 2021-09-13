package com.example.prodavnica.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prodavnica.model.Korisnik;

@Repository
public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {
	 Korisnik findByKorisnickoimeILozinka(String korisnickoime, String lozinka);
}
