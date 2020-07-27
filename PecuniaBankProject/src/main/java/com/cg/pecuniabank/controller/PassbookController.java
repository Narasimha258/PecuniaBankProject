package com.cg.pecuniabank.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.cg.pecuniabank.entity.AccountDetails;
import com.cg.pecuniabank.entity.PassbookUpdate;
import com.cg.pecuniabank.entity.Transaction;
import com.cg.pecuniabank.exception.AccountDoesntExistException;
import com.cg.pecuniabank.exception.TransactionFailedException;
import com.cg.pecuniabank.service.PassbookService;

@RestController
public class PassbookController {
	
	@Autowired
	PassbookService passbookService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("account/{accountNumber}")
	public ResponseEntity<AccountDetails> getAccountDetails(@PathVariable long accountNumber) throws AccountDoesntExistException {
			AccountDetails accountDetails = passbookService.getAccountDetailsByAccountId(accountNumber);
			return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.OK);
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("passbook/transactions/{accountNumber}")
	public ResponseEntity<List<Transaction>> getAccountallTransactionsDetails(@PathVariable long accountNumber) throws AccountDoesntExistException, TransactionFailedException {
			List<Transaction> transactionList = passbookService.getAccountTransactionDetails(accountNumber);
			return new ResponseEntity<List<Transaction>>(transactionList, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("transactions/search/{accountNumber}/{fromDate}/{toDate}")
	public List<Transaction> getAccountTransactionsByDateRange(@PathVariable("accountNumber") long accountNumber,
			@PathVariable("fromDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)  LocalDateTime fromDate,
			@PathVariable("toDate")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)  LocalDateTime toDate) throws TransactionFailedException, AccountDoesntExistException {
		return passbookService.getAccountTransactionByDateRange(accountNumber, fromDate, toDate);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("updatepassbook/{accountNumber}")
	public PassbookUpdate getLastUpdatePassbookDetails(@PathVariable long accountNumber) throws AccountDoesntExistException {
		return passbookService.passbookUpdateDetailsByAccountNumber(accountNumber);
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("passbook/transactions/{accountNumber}/{lastUpdateDate}")
	public List<Transaction> updatePassbook(@PathVariable("accountNumber") long accountNumber,
			@PathVariable("lastUpdateDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime lastUpdatedDate) throws TransactionFailedException {
		return passbookService.getTransactionDetailsAfterLastUpdateDate(accountNumber, lastUpdatedDate);
	}

}
