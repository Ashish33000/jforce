package com.jforce.service;

import com.jforce.Entity.Users;
import com.jforce.Exception.UsersException;

public interface RegisterUsers {
	
	public Users AddUsers(Users user)throws UsersException;

}
