package com.bankapp.model.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.repo.CustomerRepo;
import com.bankapp.model.service.CustomerService;
import com.bankapp.web.controller.exceptions.CustomerNotFoundException;
import com.bankapp.web.entities.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
private CustomerRepo customerRepo;

@Autowired
	public CustomerServiceImpl(CustomerRepo customerRepo) {

	this.customerRepo = customerRepo;
}
	@Override
	public List<Customer> getAllCustomer() {
	
		return customerRepo.findAll();
	}


	@Override
	public Customer getCustomerById(Integer id) {
		
		return customerRepo.findById(id).orElseThrow(()->new CustomerNotFoundException("customer with "+id+"not found"));
	}
	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}



	@Override
	public Customer updateCustomer(Integer id, Customer customer) {
		Customer CustToUpdate=getCustomerById(id);
		CustToUpdate.setName(customer.getName());
		CustToUpdate.setEmail(customer.getEmail());
		CustToUpdate.setAddress(customer.getAddress());
		CustToUpdate.setPhone(customer.getPhone());
		
		customerRepo.save(CustToUpdate);
		return CustToUpdate;
		
	}
	

}
