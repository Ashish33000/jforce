package com.jforce.VotingApp.Service;

import java.util.List;

import com.jforce.VotingApp.model.Candidate;
import com.jforce.VotingApp.model.Voter;

public interface VoterService {
	
	public void vote(Integer cadId,Integer voterId);
	public List<Candidate> findAllCandidate();
	public List<Voter> findAllVoter();
	

}
