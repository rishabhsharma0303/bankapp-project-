package com.bankapp.model.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.web.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	public List<User> findByProfile(String profile);
	public User findByUsername(String username);

	public User findByEmail(String email);
}
