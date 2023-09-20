package com.jforce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.Entity.Users;
import com.jforce.service.RegisterUsers;

@RestController
@CrossOrigin(origins = "*")
public class RegisterUserController {
	@Autowired
	private RegisterUsers regUser;
	@PostMapping("/addUser")	
	public ResponseEntity<Users> addUser(@RequestBody Users user){
		return new ResponseEntity<>(regUser.AddUsers(user),HttpStatus.OK);
	}
	

}
