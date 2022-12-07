package com.Technosignia.SmartGarage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.SmartGarage.entity.Customer;
import com.Technosignia.SmartGarage.service.CustomerService;

@RestController
public class CustomerController 
{ 
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer createCustomer (@RequestBody Customer customer)
	{ 
	
		return customerService.createCustomer(customer);
		
	} 
	
	@GetMapping("/customer/{id}")
	public Optional<Customer> findCustomerById(@PathVariable Long id)
	{ 
		return customerService.findCustomerById(id);
	} 
	
	@PutMapping("/customer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @RequestParam Long id)
	{ 
		return customerService.updateCustomer(customer, id);
	} 
	
	@DeleteMapping("/customer")
	public void deleteCustomer(Long id)
	{ 
		customerService.deleteCustomer(id);
	}

}
