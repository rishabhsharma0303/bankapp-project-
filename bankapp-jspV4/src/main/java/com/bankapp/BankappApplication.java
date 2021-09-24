package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bankapp.model.service.CustomerService;
import com.bankapp.model.service.UserService;
import com.bankapp.web.entities.Customer;
import com.bankapp.web.entities.User;

@SpringBootApplication
@EnableTransactionManagement
public class BankappApplication implements CommandLineRunner{
	@Autowired
	private UserService service;
//private CustomerService customerService;
	

	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//service.addEmployee(new User("rishabh","rishabh@gmail.com","rish123","54545","ROLE_MGR",50000.00));
//	bookService.addBook(new Book("rich dada poor dad",400.00));	
//	bookService.addBook(new Book("monk who sold the ferrari",200.00));
//	customerService.addCustomer(new Customer("rishabh",500.00,9911013L,"shahdara","rishabh2gmail.com",866457L));
//	System.out.println("books are added");
	}

}
