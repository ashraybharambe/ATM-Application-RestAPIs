package com.navyug.ATM.services;

import java.util.List;

import com.navyug.ATM.models.Transaction;

public interface ITransactionService {
	
	public List<Transaction> getTransactions(long userId, long accountId);
	
	public Transaction getTransactionById(long userId, long accountId, long transactionId);
	
	public Transaction addTransaction(Transaction transaction);
	

}
