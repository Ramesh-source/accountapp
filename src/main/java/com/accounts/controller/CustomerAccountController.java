package com.accounts.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.model.Account;
import com.accounts.services.CustAccountService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
@AllArgsConstructor
public class CustomerAccountController {
	
private CustAccountService custAccountService;
	
	@PostMapping(value = "/myAccount")
	public ResponseEntity<Account> getMyAccount(@RequestBody Account account) {
		
		log.info("Calling the SaveCategory Api");
		Account dbaccount = custAccountService.getAccount(account.getCustomerId());
		return new ResponseEntity<>(dbaccount,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAccount")
	public ResponseEntity<List<Account>> getMyAccount() {
		
		log.info("Calling the get accounts Api");
		List<Account> dbaccount = custAccountService.getAllAccount();
		return new ResponseEntity<>(dbaccount,HttpStatus.CREATED);
	}

}
