package com.navyug.ATM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.navyug.ATM.models.Transaction;
import com.navyug.ATM.services.ITransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private ITransactionService transactionService;
	
	// retrieves all accounts associated with the user 
	@GetMapping(value = "/users/{userId}/accounts/{accountId}/transactions")
	public List<Transaction> getAccounts(@PathVariable Long userId, @PathVariable long accountId){
		
		return this.transactionService.getTransactions(userId, accountId);
	}
	
	// retreive a single account by accountId
	@GetMapping(value = "/users/{userId}/accounts/{accountID}/transactions/{transactionId}")
	public Transaction getTransactionById(@PathVariable Long userId, @PathVariable Long accountId, long transactionId) {
		
		return this.transactionService.getTransactionById(userId, accountId, transactionId);
	}

}
