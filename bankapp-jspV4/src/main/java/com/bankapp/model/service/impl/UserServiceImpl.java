package com.bankapp.model.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.repo.UserDao;
import com.bankapp.model.service.UserService;
import com.bankapp.web.controller.exceptions.EmployeeNotFoundException;
import com.bankapp.web.entities.User;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAllEmployees() {
		return userDao.findByProfile("ROLE_CLERK");
	}

	@Override
	public User getEmployeeById(Integer employeeId) {
		return userDao.findById(employeeId)
				.orElseThrow(() -> new EmployeeNotFoundException("employee with id : " + employeeId + " not found"));
	}

	@Override
	public User addEmployee(User user) {
	user.setProfile("ROLE_CLERK");
		return userDao.save(user);
	}

	@Override
	public User deleteEmployee(Integer employeeId) {
		User employeeToBeDeleted = getEmployeeById(employeeId);
		userDao.delete(employeeToBeDeleted);
		return employeeToBeDeleted;
	}

	@Override
	public User updateEmployee(Integer employeeId, Double salary) {
		User employeeToBeUpdated = getEmployeeById(employeeId);
		employeeToBeUpdated.setSalary(salary);
		userDao.save(employeeToBeUpdated);
		return employeeToBeUpdated;
	}
	
	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}
	
}
