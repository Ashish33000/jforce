package com.topex.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topex.model.Zip;

public interface ZipRepository extends JpaRepository<Zip, Integer> {
	
	public Optional<Zip>  findByPostcode(Integer postcode);
	
	
  
}
