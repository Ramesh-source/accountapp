package com.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accounts.model.Account;

@Repository
public interface CustAccountRepository extends JpaRepository<Account, Long> {

	public Account getByCustomerId(int id);
}
