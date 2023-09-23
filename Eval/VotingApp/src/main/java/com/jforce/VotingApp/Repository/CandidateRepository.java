package com.jforce.VotingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jforce.VotingApp.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
