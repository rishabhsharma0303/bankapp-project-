package com.bankapp.model.service;

import org.springframework.stereotype.Controller;

import com.bankapp.web.entities.Customer;


import java.util.*;


public interface CustomerService {
	public List<Customer> getAllCustomer();
	public Customer getCustomerById(Integer id);
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Integer id,Customer customer);
	
	
}
