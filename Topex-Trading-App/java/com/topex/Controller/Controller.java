package com.topex.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topex.model.Result;
import com.topex.service.ShippingService;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	
	@Autowired
	private ShippingService ss;
	@PostMapping("/get/{weight}/{postcode}")
	public ResponseEntity<Result>  lessCostshippingHandler(@PathVariable Double weight,@PathVariable  Integer postcode){
		return new ResponseEntity<>(ss.findpriceByweight(weight, postcode),HttpStatus.OK);
	}

	
	

}
