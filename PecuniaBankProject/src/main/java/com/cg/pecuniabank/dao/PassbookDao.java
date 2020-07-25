package com.cg.pecuniabank.dao;

import java.time.LocalDateTime;

import com.cg.pecuniabank.entity.PassbookUpdate;

public interface PassbookDao {
	void passbookUpdateChangeLastUpdate(long accountNumber, LocalDateTime lastUpdatedDate);
	PassbookUpdate passbookUpdateDetailsByAccountNumber(long accountNumber);
	void passbookUpdateNewEntry(PassbookUpdate passbookUpdate);
}
