package com.bankapp.web.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "customer_table")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank(message = "can't be blank")
private String name;
	
	@NotNull(message = "can't be null")
private Double initialBalance;

@NotNull(message = "can't be null")
private Long phone;

@NotEmpty(message = "can't be empty")
private String address;
@NotEmpty(message = "can't be empty")
private String email;
	
@NotNull(message = "can't be null")
private Long aadhar;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "account_fk")
private Account account;
public Customer(String name, Double initialBalance, Long phone, String address, String email, Long aadhar) {

	this.name = name;
	this.initialBalance = initialBalance;
	this.phone = phone;
	this.address = address;
	this.email = email;
	this.aadhar = aadhar;
}


}
