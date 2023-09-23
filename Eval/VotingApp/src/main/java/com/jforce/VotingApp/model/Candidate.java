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
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cadId;
	private String name;
	private Integer age;
	private Integer votecount;

}
