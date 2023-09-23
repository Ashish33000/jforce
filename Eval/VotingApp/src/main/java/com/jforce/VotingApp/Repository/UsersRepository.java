package com.jforce.VotingApp.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jforce.VotingApp.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	public Optional<Users> findByEmail(String email);
}
