package com.bankapp.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.repo.AccountDao;
import com.bankapp.model.service.AccountService;
import com.bankapp.web.controller.exceptions.AccountNotFoundException;
import com.bankapp.web.entities.Account;
@Service
public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	@Autowired
	public AccountServiceImpl(AccountDao accountDao) {
	
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAllAccounts() {
	
		return accountDao.findAll();
	}

	@Override
	public Account getAccountById(Integer accountId) {
	
		return accountDao.findById(accountId)
				.orElseThrow(() -> new AccountNotFoundException("account with id :" + accountId + " not found"));
				
	}

	@Override
	public Account addAccount(Account account) {
		return accountDao.save(account);
	}

	@Override
	public Double getAccountBalance(Integer accountId) {
	
		return getAccountById(accountId).getAccountBalance();
	}

	@Override
	public Account updateAccount(Integer accountId, Double balance) {
		Account accountToBeUpdated = getAccountById(accountId);
		accountToBeUpdated.setAccountBalance(balance);
		accountDao.save(accountToBeUpdated);
		return accountToBeUpdated;
	}

}
