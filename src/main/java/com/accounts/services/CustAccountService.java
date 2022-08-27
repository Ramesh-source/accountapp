package com.accounts.services;

import java.util.Optional;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accounts.model.Account;
import com.accounts.repository.CustAccountRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class CustAccountService {
	
	private CustAccountRepository custAccountRepository;
	public Account getAccount(int id) {
		Optional<Account> account = Optional.of(custAccountRepository.getByCustomerId(id));
		
		if(account.isPresent()) {
			return account.get();
		}
		return null;
	}
	
	public List<Account> getAllAccount() {
		List<Account> acct =custAccountRepository.findAll();
		
		return acct;
	}

}
