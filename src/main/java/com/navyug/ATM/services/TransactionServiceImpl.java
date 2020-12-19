package com.navyug.ATM.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.navyug.ATM.models.Account;
import com.navyug.ATM.models.Transaction;
import com.navyug.ATM.models.User;
import com.navyug.ATM.repository.IAccountRepository;
import com.navyug.ATM.repository.ITransactionRepository;
import com.navyug.ATM.repository.IUserRepository;

@Service
public class TransactionServiceImpl implements ITransactionService{
	
	@Autowired
	private ITransactionRepository transactionRepository;
	@Autowired
	private IUserRepository userRepository;
	@Autowired
	private IAccountRepository accountRepository;

	@Override
	@Transactional
	public List<Transaction> getTransactions(long userId, long accountId) {
		User user = this.userRepository.findById(userId).orElseThrow();	
		Account account =this.accountRepository.findById(accountId).orElseThrow();
		return account.getTransactions();
	}

	@Override
	@Transactional
	public Transaction getTransactionById(long userId, long accountId, long transactionId) {
		if(userRepository.existsById(userId) && accountRepository.existsById(accountId)) {
			return transactionRepository.findById(transactionId).orElseThrow();
		}
		throw new NoSuchElementException("userId or accountId provided is not correct");
	}

	@Override
	@Transactional(propagation = Propagation.MANDATORY)
	public Transaction addTransaction(Transaction transaction) {
		this.transactionRepository.save(transaction);
		return transaction;
	}

}
