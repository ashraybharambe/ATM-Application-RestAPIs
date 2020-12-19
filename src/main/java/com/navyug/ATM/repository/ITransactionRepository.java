package com.navyug.ATM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.navyug.ATM.models.Transaction;

@RepositoryRestResource
public interface ITransactionRepository extends JpaRepository<Transaction, Long>{

}
