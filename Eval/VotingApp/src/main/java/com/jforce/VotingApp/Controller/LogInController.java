package com.jforce.VotingApp.Controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.VotingApp.Repository.UsersRepository;
import com.jforce.VotingApp.model.Users;

@RestController
@CrossOrigin(origins = "*")
public class LogInController {
	@Autowired
	private UsersRepository userRepo;

	
	@GetMapping("/signIn")
	public ResponseEntity<Users> getLoggedInCustomerDetailsHandler(Authentication auth){		
		
		 Users users= userRepo.findByEmail(auth.name()).orElseThrow(() -> new BadCredentialsException("Invalid Username or password"));
		
		 return new ResponseEntity<>(users, HttpStatus.ACCEPTED);
		
		
	}
}
