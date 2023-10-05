package com.topex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Supplieronetx {
	@Id
	private Double weight;

	private Double SameLocal;
	
	private Double SameMetro;
	
	private Double SameRemote;
	
	private Double NearLocal;
	
	private Double NearMetro;
	
	private Double NearRemote;
	
	private Double DistantLocal;
	
	private Double DistantMetro;	
		
	private Double DistantRemote;


}
