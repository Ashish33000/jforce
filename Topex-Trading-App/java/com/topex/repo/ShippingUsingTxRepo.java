package com.topex.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.topex.model.Supplieronetx;

public interface ShippingUsingTxRepo extends JpaRepository<Supplieronetx, Double> {
	
	
	public Optional<Supplieronetx> findByWeight (double distance);
	


}
