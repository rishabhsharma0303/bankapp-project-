package com.bankapp.model.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.web.entities.Transaction;

@Repository
public interface TransactionDao extends JpaRepository<Transaction, Integer>{

	public List<Transaction> findByStatus(String status);

	public List<Transaction>  findByFromAccNo(Integer fromAccNo);
	
	
	public List<Transaction>  findByToAccNo(Integer toAccNo);
	
}