package com.jforce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.jforce.model.Users;
import com.jforce.service.UsersService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

	
		
	
	@Autowired
	private UsersService usersService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	

	
	@PostMapping("/adduser")
	public ResponseEntity<Users> saveUsersHandler(@RequestBody Users users){


		users.setPassword(passwordEncoder.encode(users.getPassword()));
		users.setRole(users.getRole().toUpperCase());

        Users registeredUser = usersService.registerUsers(users);

		return new ResponseEntity<>(registeredUser,HttpStatus.ACCEPTED);
		
	}
	

	
	
	
}
