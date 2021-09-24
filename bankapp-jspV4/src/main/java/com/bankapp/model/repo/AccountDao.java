package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.web.entities.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Integer>{

}