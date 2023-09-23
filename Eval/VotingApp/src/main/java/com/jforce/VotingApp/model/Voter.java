package com.jforce.VotingApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Voter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer voterId;
	private String name;
	private boolean hasVoted;

}