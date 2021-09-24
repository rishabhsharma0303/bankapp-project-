package com.bankapp.web.controller;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bankapp.model.dto.TransactionObject;
import com.bankapp.model.service.TransactionService;
import com.bankapp.security.SecurityUser;
import com.bankapp.web.entities.Transaction;
@RequestMapping("/transaction")
@Controller
public class TransactionController
{
	private TransactionService transactionService;

	@Autowired
	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	@GetMapping("showAllTransactions")
	public String getAllTransaction(Model model) {
		model.addAttribute("transactions", transactionService.getAllTransactions());
		return "showAllTransactions";
	}

 

//	@GetMapping("/pendingTransaction")
//	public String getAllPendingTransaction(   @AuthenticationPrincipal SecurityUser secUserModel model) {
//		model.addAttribute("transactions", transactionService.getTransactionListByStatus("PENDING"));
//		map.addAttribute("profile", secUser.getUser().getProfile());
//		return "pendingTransaction";
//	}
//	
	
	@GetMapping(value = "pendingTransaction")
	public String getAllPendingTransaction(ModelMap map, @AuthenticationPrincipal SecurityUser secUser) {

	map.addAttribute("profile", secUser.getUser().getProfile());
	map.addAttribute("transactions", transactionService.getTransactionListByStatus("PENDING"));
	return "pendingTransaction";

	}
	@GetMapping("/approveTransaction")
	public String approveTransaction(@RequestParam (name="id")Integer transactionId) {
		transactionService.approvePendingTransaction(transactionId);
		return "redirect:showAllTransactions";
	}
	
	@GetMapping("/rejectTransaction")
	public String rejectTransaction(@RequestParam (name="id")Integer transactionId) {
		transactionService.rejectPendingTransaction(transactionId);
		return "redirect:showAllTransactions";
	}
	
	@GetMapping("/withdrawMoney")
	public String withdrawMoneyGet(Model model) {
		model.addAttribute("transactionObject", new TransactionObject());
		return "withdraw";
	}

	@PostMapping("/withdrawMoney")
	public String withdrawMoneyPost(@Valid @ModelAttribute(name = "transactionObject") TransactionObject tx,BindingResult result) {
		if(result.hasErrors() && result.getErrorCount()>1) {
			return "withdraw";
		}
		
		Integer fromAccountNumber = tx.getFromAccountNumber();
		Double withdrawAmount = tx.getAmount();
		transactionService.withdrawMoney(fromAccountNumber, withdrawAmount);
//		try {
//			transactionService.withdrawMoney(fromAccountNumber, withdrawAmount);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("excperfd547655434534");
//		}
//		
		return "redirect:showAllTransactions";
	}
	
	@GetMapping("depositMoney")
	public String depositMoneyGet(Model model) {
		model.addAttribute("transactionObject", new TransactionObject());
		return "deposit";
	}

	@PostMapping("depositMoney")
	public String depositMoneyPost(@Valid @ModelAttribute(name = "transactionObject") TransactionObject tx,BindingResult result) {
System.out.println(result.getErrorCount()+"---------------");

		
				if(result.hasErrors() && result.getErrorCount()>1) {
			return "deposit";
		}
		Integer toAccountNumber = tx.getToAccountNumber();
		Double depositAmount = tx.getAmount();

		transactionService.depositMoney(toAccountNumber, depositAmount);

		return "redirect:showAllTransactions";
		//return "redirect:allCustomers";

	}
	
	@GetMapping("/transferMoney")
	public String transferMoneyGet(Model model) {
		model.addAttribute("transactionObject", new TransactionObject());
		return "transfer";
	}

	@PostMapping("/transferMoney")
	public String transferMoneyPost(@Valid @ModelAttribute(name = "transactionObject") TransactionObject tx,BindingResult result) {
	if(result.hasErrors()) {
		return "transfer";
	}
		Integer fromAccountNumber = tx.getFromAccountNumber();
		Integer toAccountNumber = tx.getToAccountNumber();
		Double amount = tx.getAmount();

		transactionService.transferMoney(fromAccountNumber, toAccountNumber, amount);

		return "redirect:showAllTransactions";
	}

	@GetMapping("/accountStatement")
	public String getAccountStatement(@RequestParam (name="id")int id,Model model) {
		List<Transaction> accountStatement = transactionService.accountStatement(id);
		model.addAttribute("transactions", accountStatement);
		return "showAllTransactions";
	}
	
}
