package com.bankapp.web.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = { "account" })
@Entity
@Table(name = "transaction_history_table")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer transactionId;
private Integer fromAccNo;
private Integer toAccNo;
private String transactionType; // can be withdraw or deposit
private Double amount;
private String status;  //can be pending or approve

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "account_fk")
private Account account;
public Transaction(Integer fromAccNo, Integer toAccNo, String transactionType, Double amount, String status) {
	
	this.fromAccNo = fromAccNo;
	this.toAccNo = toAccNo;
	this.transactionType = transactionType;
	this.amount = amount;
	this.status = status;
}


}
