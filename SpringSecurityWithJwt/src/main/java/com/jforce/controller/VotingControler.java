package com.jforce.controller;

import com.jforce.model.Candidate;
import com.jforce.model.Voter;
import com.jforce.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class VotingControler {

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
    @PostMapping("/vote/{CandId}")
    public ResponseEntity<String> VoteHandler(@PathVariable Integer CandId, @RequestParam Integer VoterId) {
        try {
            voterSer.vote(CandId, VoterId);
            return ResponseEntity.ok("Voted Sucessfully");
        } catch (Exception e) {


            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
