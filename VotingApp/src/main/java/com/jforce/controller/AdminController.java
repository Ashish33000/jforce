package com.jforce.controller;

import com.jforce.model.Candidate;
import com.jforce.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    private CandidateRepository cadSer;
    @PostMapping("/addCandidate")
    @ResponseStatus(code = HttpStatus.OK)
    public Candidate addCandidateHandler(@RequestBody Candidate cad){
        return cadSer.save(cad);
    }
}
