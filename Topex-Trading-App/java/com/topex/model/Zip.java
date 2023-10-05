package com.topex.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Zip {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ZipId;
	private Integer postcode;
	private String shippingusingTX;
	private String shippingusingFL;
	
	
	

}
