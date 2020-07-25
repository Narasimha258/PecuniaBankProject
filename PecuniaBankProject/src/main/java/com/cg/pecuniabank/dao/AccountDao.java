package com.cg.pecuniabank.dao;

import com.cg.pecuniabank.entity.AccountDetails;

public interface AccountDao {
	
	public void insertAccountDetails(AccountDetails accountdetails);
	
	public AccountDetails viewAccountDetailsByAccountId(long accountId);


}
