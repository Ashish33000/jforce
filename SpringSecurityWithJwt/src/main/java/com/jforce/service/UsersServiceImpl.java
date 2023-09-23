package com.jforce.service;

import com.jforce.exception.UserException;
import com.jforce.model.Users;
import com.jforce.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public Users registerUsers(Users users) throws UserException {
		
		return usersRepository.save(users);
		
		
	}



}
