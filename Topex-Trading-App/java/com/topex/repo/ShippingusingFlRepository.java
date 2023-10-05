package com.topex.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.topex.model.Suppliertwofl;

public interface ShippingusingFlRepository extends JpaRepository<Suppliertwofl, Double>  {
	
	
	
	public Optional<Suppliertwofl> findByWeight (double distance);

	

}
