package com.topex.service;

import com.topex.Exception.TopexException;
import com.topex.model.Result;

public interface ShippingService {
	
	public Result findpriceByweight(Double weight,Integer Postcode) throws TopexException;

}
