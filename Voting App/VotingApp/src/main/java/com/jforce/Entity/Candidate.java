package com.jforce.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidate{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cadId;
	
	private String Candidate;
	private boolean  vote;
	@OneToOne
	private Users user;
	private LocalDateTime time;

}