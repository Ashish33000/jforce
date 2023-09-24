package com.jforce.service;

import com.jforce.model.Candidate;
import com.jforce.model.Voter;

import java.util.List;

public interface VoterService {
    public void vote(Integer cadId,Integer voterId);
    public List<Candidate> findAllCandidate();
    public List<Voter> findAllVoter();
}
