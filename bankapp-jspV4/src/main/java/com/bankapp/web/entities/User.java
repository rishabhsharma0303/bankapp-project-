package com.bankapp.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "user_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer userId;
	
@NotEmpty(message = "can't be empty")	
private  String username;
@NotEmpty(message = "can't be empty")	
private  String email;
@NotEmpty(message = "can't be empty")	
private  String password;
@NotEmpty(message = "can't be empty")	
private  String phone;
@NotEmpty(message = "can't be empty")	
private String profile; //admin clerk
@NotNull(message = "can't be null")
private Double salary;
public User(String username, String email, String password, String phone, String profile, Double salary) {
	
	this.username = username;
	this.email = email;
	this.password = password;
	this.phone = phone;
	this.profile = profile;
	this.salary = salary;
}

}
