package com.bankapp.model.dto;


import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TransactionObject {
	@NotNull(message="fromAccountNumber can't left blank")
	private Integer fromAccountNumber;
	@NotNull(message="toAccountNumber can't left blank")
	private Integer toAccountNumber;
	@NotNull(message="amount can't left blank")
	private Double amount;
}