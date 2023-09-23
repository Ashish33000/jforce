package com.jforce.service;

import com.jforce.exception.VoterException;
import com.jforce.model.Candidate;
import com.jforce.model.Voter;
import com.jforce.repository.CandidateRepository;
import com.jforce.repository.VoterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CancellationException;

@Service
public class VoterServiceImpl implements VoterService{
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
        return candRepo.findAll();
    }

    @Override
    public List<Voter> findAllVoter() {
        return voterRepo.findAll();
    }
}
