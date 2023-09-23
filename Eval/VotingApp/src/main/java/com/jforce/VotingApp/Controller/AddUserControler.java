package com.jforce.VotingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.VotingApp.Service.UsersService;
import com.jforce.VotingApp.model.Users;

@RestController
@CrossOrigin(origins = "*")
public class AddUserControler {
	@Autowired
	private UsersService userSer;
	@PostMapping("/addUser")	
	public ResponseEntity<Users> addUserHandler(@RequestBody Users user){
		return new ResponseEntity<>(userSer.addUsers(user),HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<Users>> findAllUsers(){
		return new ResponseEntity<>(userSer.FindAllUsers(),HttpStatus.OK);
	}
	


}