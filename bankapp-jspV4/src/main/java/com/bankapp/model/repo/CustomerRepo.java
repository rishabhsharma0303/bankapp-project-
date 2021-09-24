package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.web.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
