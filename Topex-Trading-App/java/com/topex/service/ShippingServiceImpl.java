package com.topex.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topex.Exception.TopexException;
import com.topex.model.Result;
import com.topex.model.Supplieronetx;
import com.topex.model.Suppliertwofl;
import com.topex.model.Zip;
import com.topex.repo.ShippingUsingTxRepo;
import com.topex.repo.ShippingusingFlRepository;
import com.topex.repo.ZipRepository;
@Service
public class ShippingServiceImpl implements ShippingService {
	
	
	 @Autowired
	 private ZipRepository ziprepo;
	 @Autowired
	 private ShippingusingFlRepository flrepo;
	 @Autowired
	 private ShippingUsingTxRepo txRepo;

	 @Override
	    public Result findpriceByweight(Double weight, Integer postcode) throws TopexException {

	        Result res = new Result();

	        Optional<Zip> opt = ziprepo.findByPostcode(postcode);

	        try {
	            if (opt.isPresent()) {

	                Zip zip = opt.get();
	                Integer postCode = zip.getPostcode();
	                String flShipping = zip.getShippingusingFL();
	                String txShipping = zip.getShippingusingTX();

	                Optional<Supplieronetx> supplieronetx = txRepo.findByWeight(weight);

	                Optional<Suppliertwofl> supplieronefl = flrepo.findByWeight(weight);

	               

	                double v1 = 0 ;
	                double v2 = 0;
	                
	               
	                if(flShipping.toLowerCase().equals("same local")){

	                    v1 = supplieronetx.get().getNearLocal();
	                  

	                }else if(flShipping.toLowerCase().equals("same metro")){

	                    v1 = supplieronetx.get().getNearMetro();
	                    
	                }
	                else if(flShipping.toLowerCase().equals("same remote")){

	                    v1 = supplieronetx.get().getNearRemote();
	                
	                }
	                else if(flShipping.toLowerCase().equals("near local")){

	                    v1 = supplieronetx.get().getSameLocal();
	                    
	  
	                }
	                else if(flShipping.toLowerCase().equals("near metro")){

	                    v1 = supplieronetx.get().getSameMetro();
	                 
	                    
	                }
	                else if(flShipping.toLowerCase().equals("near remote")){

	                    v1 = supplieronetx.get().getSameRemote();
	                  

	                }
	                else if(flShipping.toLowerCase().equals("distant local")){

	                    v1 = supplieronetx.get().getDistantLocal();
	                   


	                }else if(flShipping.toLowerCase().equals("distant metro")){

	                    v1 = supplieronetx.get().getDistantMetro();
	                    

	                }else if(flShipping.toLowerCase().equals("distant remote")){

	                    v1 = supplieronetx.get().getDistantRemote();
	                   
	                    
	                }

	                
	                
	                if(txShipping.toLowerCase().equals("same local")){
	                    
	                    v2 = supplieronefl.get().getNearLocal();
	                   

	                }else if(txShipping.toLowerCase().equals("same metro")){
	                    
	                    v2 = supplieronefl.get().getNearMetro();
	                    

	                }
	                else if(txShipping.toLowerCase().equals("same remote")){
	                    
	                    v2 = supplieronefl.get().getNearRemote();
	                    
	                }
	                else if(txShipping.toLowerCase().equals("near local")){
	         
	                    v2 = supplieronefl.get().getSameLocal();
	                   

	                }else if(txShipping.toLowerCase().equals("near metro")){

	                    v2 = supplieronetx.get().getSameMetro();
	                    
	                    
	                }else if(txShipping.toLowerCase().equals("near remote")){
	                    
	                    v2 = supplieronefl.get().getSameRemote();
	                 
	                }
	                else if(txShipping.toLowerCase().equals("distant local")){
	                    
	                    v2 = supplieronefl.get().getDistantLocal();
	                    

	                }
	                else if(txShipping.toLowerCase().equals("distant metro")){
	                    
	                    v2 = supplieronefl.get().getDistantMetro();
	                    

	                }
	                else if(txShipping.toLowerCase().equals("distant remote")){
	                    
	                    v2 = supplieronefl.get().getDistantRemote();
	                   

	                }
	         
	                
	                
	                
	                
	        
	                
	
           System.out.println(v1+"shipper price tx");
           System.out.print(v2+"shippers  price fl");


	                if(v1 < v2 ){

	                    return new Result(weight,"Detination Zone Topex",v1);
	                    
	                }else{
	                    
	                    return new Result(weight,"Detination Zone Fulfillo",v2);
	                    
	                }


	            } else {
	                throw new TopexException("code have some errror3");
	            }

	        } catch (TopexException e) {
	            throw new TopexException("code have some errror final");
	        }



	    }
	
	
	
	
}
 