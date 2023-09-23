package com.jforce.VotingApp.Service;

import java.util.List;

import com.jforce.VotingApp.Exception.UsersException;
import com.jforce.VotingApp.model.Users;

public interface UsersService {
	
	public Users addUsers(Users users)throws UsersException;
	public List<Users> FindAllUsers() throws UsersException;

}