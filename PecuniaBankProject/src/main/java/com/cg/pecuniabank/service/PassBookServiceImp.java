package com.cg.pecuniabank.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.pecuniabank.dao.AccountDao;
import com.cg.pecuniabank.dao.BranchDetailsDao;
import com.cg.pecuniabank.dao.PassbookDao;
import com.cg.pecuniabank.dao.TransactionDao;
import com.cg.pecuniabank.entity.AccountDetails;
import com.cg.pecuniabank.entity.BranchDetails;
import com.cg.pecuniabank.entity.PassbookUpdate;
import com.cg.pecuniabank.entity.Transaction;
import com.cg.pecuniabank.exception.AccountDoesntExistException;
import com.cg.pecuniabank.exception.TransactionFailedException;

public class PassBookServiceImp implements PassbookService{
	
	@Autowired
	PassbookDao passbookDao;

	@Autowired
	AccountDao accountDao;

	@Autowired
	BranchDetailsDao branchDao;

	@Autowired
	TransactionDao transactionDao;

	@Override
	public AccountDetails getAccountDetailsByAccountId(long accountId) throws AccountDoesntExistException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBranchDetails(BranchDetails branchDetails) {
		branchDao.insertBranchDetails(branchDetails);
		
	}

	@Override
	public void insertAccountDetails(AccountDetails accountDetails) {
		accountDao.insertAccountDetails(accountDetails);
		
	}

	@Override
	public void insertTransactionDetails(Transaction transaction) {
		transactionDao.insertTranscationDetails(transaction);
		
	}

	@Override
	public List<Transaction> getAccountTransactionByDateRange(long accountNumber, LocalDateTime fromDate,
			LocalDateTime toDate) throws TransactionFailedException, AccountDoesntExistException {
		AccountDetails accountDetails=accountDao.viewAccountDetailsByAccountId(accountNumber);
		if(accountDetails!=null)
		{
			LocalDateTime currentSysDate=LocalDateTime.now();
			boolean isAfter=fromDate.isAfter(toDate)|| toDate.isAfter(currentSysDate);
			if(isAfter)
			{
				throw new TransactionFailedException("Please Enter valid Date and From Date Should not be Greater than To Date");
			}
			List<Transaction> transcation_list=transactionDao.getTranscationDetailsfromandToDate(accountNumber, fromDate, toDate);
			if(transcation_list.isEmpty())
			{
				throw new TransactionFailedException("No Transcations Found during this period");
			}
			else
				return transcation_list;
		}
		throw new AccountDoesntExistException("Account Number doesn't exists! Please enter valid Account Number");
	}

	@Override
	public PassbookUpdate passbookUpdateDetailsByAccountNumber(long accountNumber) throws AccountDoesntExistException {
		AccountDetails accountDetails=accountDao.viewAccountDetailsByAccountId(accountNumber);
		if(accountDetails!=null)
		{
			PassbookUpdate passbookDetails= passbookDao.passbookUpdateDetailsByAccountNumber(accountNumber);
			LocalDateTime currentSystemDate = LocalDateTime.now();
			if(passbookDetails==null)
			{
				passbookDetails=getNewPassbookUpdate(accountNumber,accountDetails.getOpeningDate());
			}
			passbookDao.passbookUpdateChangeLastUpdate(accountNumber, currentSystemDate);
		}
		throw new AccountDoesntExistException("Account Number doesn't exists! Please enter valid Account Number");
	}
	
	private PassbookUpdate getNewPassbookUpdate(long accountNumber, LocalDateTime createDate) {
		PassbookUpdate passbookUpdateDetails = new PassbookUpdate();
		passbookUpdateDetails.setAccountNumber(accountNumber);
		passbookUpdateDetails.setLastUpdate(createDate);
		passbookDao.passbookUpdateNewEntry(passbookUpdateDetails);
		return passbookUpdateDetails;
	}

	@Override
	public List<Transaction> getTransactionDetailsAfterLastUpdateDate(long accountNumber, LocalDateTime lastUpdateDate)
			throws TransactionFailedException {
		List<Transaction> transaction_list=transactionDao.getTranscationAfterLastUpdate(accountNumber, lastUpdateDate);
		if(transaction_list.isEmpty())
		{
			throw new TransactionFailedException("No Recent Transcations Found!!!");
		}
		return transaction_list;
	}

	@Override
	public List<Transaction> getAccountTransactionDetails(long accountId)
			throws AccountDoesntExistException, TransactionFailedException {
		AccountDetails accountDetails=accountDao.viewAccountDetailsByAccountId(accountId);
		if(accountDetails!=null)
		{
			List<Transaction> transaction_list=transactionDao.getTranscationDetails(accountId);
			if(transaction_list.isEmpty())
			{
				throw new TransactionFailedException("There is no transaction on this account number.");
			}
			else
				return transaction_list;
		}
		throw new AccountDoesntExistException("Account doesn't Exist.Please Enter the Valid Account Number.");
		
	}

}
