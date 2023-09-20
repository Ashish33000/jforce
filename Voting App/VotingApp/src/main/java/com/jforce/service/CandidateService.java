package com.jforce.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.Entity.Candidate;
import com.jforce.Entity.Users;
import com.jforce.Exception.CandidateException;
import com.jforce.Repository.CandidateRepo;
import com.jforce.Repository.UserRepository;

@Service
public class CandidateService {
	@Autowired
	private  CandidateRepo cadRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public Candidate addCan(Candidate cad) {
		
		return cadRepo.save(cad);
		
	}
	
	public boolean hasUserVoted(Users user) {
		return cadRepo.existsById(user.getUid());
	}
	
	public void CastVote(Users user,String option) {
		if(!hasUserVoted(user)) {
			Candidate c=new Candidate();
			c.setCadId(user.getUid());
			c.setCandidate(option);
			c.setTime(LocalDateTime.now());
			cadRepo.save(c);
			
		}else {
			throw new CandidateException("user has Already voted");
		}
	}
	
	
	
	
	
	
	
	
	

}
