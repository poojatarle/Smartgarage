package com.Technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.CustomerRepository;
import com.Technosignia.SmartGarage.entity.Customer;

@Service
public class CustomerService
{ 
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	public Customer createCustomer(Customer cust)
	{ 
		return customerRepository.save(cust);
	} 
	
	
	public Optional<Customer> findCustomerById(Long id)
	{ 
		return customerRepository.findById(id);
	} 
	
	
	public Customer updateClient(Customer customer, Long id)
	{ 
		Optional<Customer> opCust = customerRepository.findById(id);
		Customer cust = opCust.get();
		cust.setName(customer.getName());
		cust.setAddress(customer.getAddress());
		cust.setContact(customer.getContact());
		cust.setEmail(customer.getEmail());
		
		return customerRepository.save(cust);
	} 
	
	
	public void deleteCustomer(Long id)
	{ 
		customerRepository.deleteById(id);
	}

}
