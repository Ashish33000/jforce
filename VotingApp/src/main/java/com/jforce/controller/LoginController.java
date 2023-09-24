package com.jforce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.model.Users;
import com.jforce.repository.UsersRepository;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping("/signIn")
	public ResponseEntity<Users> getLoggedIUerDetailsHandler(Authentication auth){
		
		
		 Users customer= usersRepository.findByEmail(auth.getName()).orElseThrow(() -> new BadCredentialsException("Invalid Username or password"));
		

		 
		 
		 return new ResponseEntity<>(customer, HttpStatus.ACCEPTED);
		
		
	}
	
}
