package com.example.prodavnica.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prodavnica.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
