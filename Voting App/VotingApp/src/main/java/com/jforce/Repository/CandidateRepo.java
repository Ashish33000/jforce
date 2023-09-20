package com.jforce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jforce.Entity.Candidate;

public interface CandidateRepo extends JpaRepository<Candidate, Integer> {
	
	

}
