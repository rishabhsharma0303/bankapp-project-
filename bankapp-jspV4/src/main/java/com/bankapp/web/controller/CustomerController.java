package com.bankapp.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bankapp.model.service.CustomerService;
import com.bankapp.web.entities.Account;
import com.bankapp.web.entities.Customer;

@RequestMapping(path = "/customer")
@Controller
public class CustomerController {
private CustomerService customerService;
@Autowired
public CustomerController(CustomerService customerService) {
	this.customerService = customerService;
}

@GetMapping(value = "allCustomers")
public String showAllCustomers(ModelMap map) {
	map.addAttribute("customers", customerService.getAllCustomer());
	return "showAllCustomers";
}

@GetMapping(value = "addCustomer")
public String addCustomer(ModelMap map) {
	map.addAttribute("customer", new Customer());
	return "addCustomer";
}

@GetMapping(value = "updateCustomer")
public String updateCustomer(HttpServletRequest request, ModelMap map) {
	Integer id = Integer.parseInt(request.getParameter("id"));
	Customer customer = customerService.getCustomerById(id);
	map.addAttribute("customer", customer);

	return "editCustomerform";
}
@PostMapping(value = "addCustomer")
public String addCustomerPost(@Valid @ModelAttribute(name = "customer") Customer customer,BindingResult result ,HttpServletRequest request) {
	System.out.println(result.getErrorCount());
	
	if(result.hasFieldErrors()) {
		return "addCustomer";
	}
	Integer id = customer.getId();
	if (id == 0) {
		//customerService.addCustomer(customer);
	Double balance = Double.parseDouble(request.getParameter("initialBalance"));
		

		Account account = new Account(balance);
		customer.setAccount(account);
		account.setCustomer(customer);

		customerService.addCustomer(customer);
	}else {
		customerService.updateCustomer(id, customer);
		//customerService.updateCustomer(id, customer);
	}
	
	
	return "redirect:allCustomers";
}
}
