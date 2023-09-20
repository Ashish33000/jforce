package com.jforce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.Entity.Users;
import com.jforce.Exception.UsersException;
import com.jforce.Repository.UserRepository;

@Service
public class RegisterUsersImpl implements RegisterUsers{
	@Autowired
	private UserRepository userRepo;

	@Override
	public Users AddUsers(Users user) throws UsersException {
		Users existenguser=userRepo.findByUsername(user.getUsername());
		if(existenguser!=null) {
			throw new UsersException("Users Alredy register with this username");
		}
			return userRepo.save(user);	
	
	}

	

}
