package com.jforce.VotingApp.Service;

import java.util.List;
import java.util.concurrent.CancellationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.VotingApp.Exception.VoterException;
import com.jforce.VotingApp.Repository.CandidateRepository;
import com.jforce.VotingApp.Repository.VoterRepository;
import com.jforce.VotingApp.model.Candidate;
import com.jforce.VotingApp.model.Voter;

import jakarta.transaction.Transactional;

@Service
public class VoterServiceImpl implements VoterService {
	@Autowired
	private VoterRepository voterRepo;
	@Autowired
	private CandidateRepository candRepo;
    @Transactional
	@Override
	public void vote(Integer cadId, Integer voterId) {
		Voter voter=voterRepo.findById(voterId).orElse(null);
		if(voter==null||voter.isHasVoted()) {
			throw new VoterException("Voter has Already Voted");
		}
		Candidate cand=candRepo.findById(cadId).orElseThrow(()-> new CancellationException("Candidate Not found"));
		cand.setVotecount(cand.getVotecount()+1);
		voter.setHasVoted(true);
		
	}
	@Override
	public List<Candidate> findAllCandidate() {
		// TODO Auto-generated method stub
		return candRepo.findAll();
	}
	@Override
	public List<Voter> findAllVoter() {
		// TODO Auto-generated method stub
		return voterRepo.findAll();
	}

}
