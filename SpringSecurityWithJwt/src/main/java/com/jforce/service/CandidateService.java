package com.jforce.service;

import com.jforce.model.Candidate;
import com.jforce.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository cadRepo;

    public Candidate addCandidate(Candidate cad){
        return cadRepo.save(cad);
    }
}
