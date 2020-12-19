package com.navyug.ATM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.navyug.ATM.models.Account;

@RepositoryRestResource
public interface IAccountRepository extends JpaRepository<Account, Long>{

}
