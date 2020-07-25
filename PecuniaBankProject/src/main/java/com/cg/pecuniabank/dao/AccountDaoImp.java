package com.cg.pecuniabank.dao;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.pecuniabank.entity.AccountDetails;
@Repository
public class AccountDaoImp implements AccountDao{
	
	@Autowired
	EntityManager entityManager;

	@Override
	public void insertAccountDetails(AccountDetails accountdetails) {
		entityManager.persist(accountdetails);
		
	}

	@Override
	public AccountDetails viewAccountDetailsByAccountId(long accountId) {
		AccountDetails accountdetails =entityManager.find(AccountDetails.class, accountId);
		return accountdetails;
	}

}
