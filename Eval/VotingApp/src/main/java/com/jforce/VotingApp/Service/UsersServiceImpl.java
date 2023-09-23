package com.jforce.VotingApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.VotingApp.Exception.UsersException;
import com.jforce.VotingApp.Repository.UsersRepository;
import com.jforce.VotingApp.model.Users;
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
     private UsersRepository userRepo;
	@Override
	public Users addUsers(Users users) throws UsersException {
		Optional<Users> opt=userRepo.findById(users.getUserId());
		if(opt.isPresent()) {
			throw new UsersException("Users is Added Already");
		}
		return userRepo.save(users);
	}

	@Override
	public List<Users> FindAllUsers() throws UsersException {
		List<Users> list=userRepo.findAll();
		if(list.isEmpty()) {
			throw new UsersException("No Users Found");
		}
		return list;
	}

}
