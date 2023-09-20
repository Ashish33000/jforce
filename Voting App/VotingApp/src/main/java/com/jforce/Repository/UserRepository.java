package com.jforce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jforce.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
	public Users findByUsername(String username);

}
