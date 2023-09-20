package com.jforce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.Entity.Users;
import com.jforce.Repository.UserRepository;

@RestController
@CrossOrigin(origins = "*")
public class UsersLoginLogOutController {
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/signIn")
	public ResponseEntity<Users> getLoggedInCustomerDetailsHandler(Authentication auth){
		
		
		 Users users= userRepo.findByUsername(auth.getName()).orElseThrow(auth);
		
		
		 
		 
		 return new ResponseEntity<>(users, HttpStatus.ACCEPTED);
		
		
	}
	
	
	

}
