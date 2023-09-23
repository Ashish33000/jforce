package com.jforce.repository;

import com.jforce.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepository extends JpaRepository<Voter,Integer> {
}
