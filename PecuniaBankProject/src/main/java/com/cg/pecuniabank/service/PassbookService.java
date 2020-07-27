package com.cg.pecuniabank.service;

import java.time.LocalDateTime;
import java.util.List;

import com.cg.pecuniabank.entity.AccountDetails;
import com.cg.pecuniabank.entity.BranchDetails;
import com.cg.pecuniabank.entity.PassbookUpdate;
import com.cg.pecuniabank.entity.Transaction;
import com.cg.pecuniabank.exception.AccountDoesntExistException;
import com.cg.pecuniabank.exception.TransactionFailedException;



public interface PassbookService {
	
	AccountDetails getAccountDetailsByAccountId(long accountId) throws AccountDoesntExistException;

	void insertBranchDetails(BranchDetails branchDetails);
	void insertAccountDetails(AccountDetails accountDetails);
	void insertTransactionDetails(Transaction transaction);
	
	List<Transaction> getAccountTransactionByDateRange(long accountNumber, LocalDateTime fromDate, LocalDateTime toDate) throws TransactionFailedException, AccountDoesntExistException;	
	PassbookUpdate passbookUpdateDetailsByAccountNumber(long accountNumber) throws AccountDoesntExistException;
	List<Transaction> getTransactionDetailsAfterLastUpdateDate(long accountNumber,LocalDateTime lastUpdateDate) throws TransactionFailedException;

	List<Transaction> getAccountTransactionDetails(long accountId) throws AccountDoesntExistException, TransactionFailedException;

}
