package com.springrest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entities.Customer;
import com.springrest.service.CustomerService;

@RestController
public class Controller {
	
	  @Autowired
	  private CustomerService cService;
	 
	  //ADD CUSTOMER
	  	@PostMapping("/customer")
	 	public void addCus(@RequestBody Customer c) {
	  		cService.addCustomer(c);
	 	}
	  	
	  //GET CUSTOMER
	  	@GetMapping("/customer/{id}")
	  	public Optional<Customer> searchCus(@PathVariable("id") String id) {
	  		return cService.getCustomer(id);
	  	} 

	  //DELETE CUSTOMER
	 	@DeleteMapping("/customer/{id}")
	 	public void deleteCus(@PathVariable String id) {
	 		cService.deleteCustomer(id);
	 		
	   }
	 	
	  // GET ALL CUSTOMER
		@GetMapping("/customers")
		public List<Customer> getAllCus() {
			return cService.getAllCustomer();
		}

	  //UPDATE CUSTOMER
	 	@PutMapping("/customer/{id}")
		public void UpdateCus(@PathVariable("id") String id, @RequestBody Customer c) {
	 		cService.updateCustomer(id,c);
		}
}
