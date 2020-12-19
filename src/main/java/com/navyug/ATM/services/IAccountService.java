package com.navyug.ATM.services;

import java.util.List;

import com.navyug.ATM.models.Account;
import com.navyug.ATM.models.InsufficientAmountException;
import com.navyug.ATM.models.Transaction;
import com.navyug.ATM.models.User;

public interface IAccountService {
	
	public List<Account> getAccounts(long userId);
	
	public Transaction withdraw(double withDrawAmount, Account account) throws InsufficientAmountException;
	
	public Transaction deposit(double depositAmount, Account account);
	
	public Account getAccountById(long userId, long accountId);
	
	public Account addOrUpdateAccount(Account account);
}
