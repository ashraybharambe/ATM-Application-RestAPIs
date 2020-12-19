package com.navyug.ATM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.navyug.ATM.models.User;

@RepositoryRestResource
public interface IUserRepository extends JpaRepository<User, Long> {

}
