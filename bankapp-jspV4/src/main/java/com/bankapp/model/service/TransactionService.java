package com.bankapp.model.service;
import java.util.*;

import com.bankapp.web.entities.Transaction;
public interface TransactionService {
	public List<Transaction> getAllTransactions();

	public Transaction getTransactionById(int transactionId);

	public Transaction addTransaction(Transaction transaction);

	public Transaction updateTransaction(int transactionId, String status);

	public void depositMoney(Integer toAccountNumber,Double amount);
	
	public void withdrawMoney(Integer fromAccountNumber,Double amount);

	public void transferMoney(Integer fromAccountNumber,Integer toAccountNumber,Double amount);

	public List<Transaction> getTransactionListByStatus(String status);

	public void approvePendingTransaction(Integer transactionId);
	
	public void rejectPendingTransaction(Integer transactionId);

	public List<Transaction> accountStatement(Integer accountNumber);
}