package com.jforce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.Entity.Candidate;
import com.jforce.service.CandidateService;

@RestController
public class VoteController {
	@Autowired
	private CandidateService cadser;
	@PostMapping("/addCandidate")
	public ResponseEntity<Candidate> addCandidate(@RequestBody Candidate cad){
		return new ResponseEntity<Candidate>(cadser.addCan(cad),HttpStatus.OK);
	}
	

}
