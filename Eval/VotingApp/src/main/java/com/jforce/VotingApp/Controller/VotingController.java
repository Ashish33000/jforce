package com.jforce.VotingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.VotingApp.Service.VoterService;
import com.jforce.VotingApp.model.Candidate;
import com.jforce.VotingApp.model.Voter;

@RestController
@CrossOrigin(origins = "*")
public class VotingController {
	@Autowired
	private VoterService voterSer;
	@GetMapping("/candidates")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Candidate> getAllCandidateHandler(){
		return voterSer.findAllCandidate();
	}
	@GetMapping("/voters")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Voter> getAllVoterHandler(){
		return voterSer.findAllVoter();
	}
	
	public ResponseEntity<String> VoteHandler(@RequestParam Integer CandId,@RequestParam Integer VoterId) {
		try {
			voterSer.vote(CandId, VoterId);
			return ResponseEntity.ok("Voted Sucessfully");
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

}
