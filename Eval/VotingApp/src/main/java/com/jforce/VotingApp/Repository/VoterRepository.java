package com.jforce.VotingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jforce.VotingApp.model.Voter;

public interface VoterRepository extends JpaRepository<Voter, Integer> {

}
