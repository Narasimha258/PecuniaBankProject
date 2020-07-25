package com.cg.pecuniabank.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.cg.pecuniabank.entity.Transaction;

public interface TransactionDao {
	void insertTranscationDetails(Transaction transcation);
	List<Transaction> getTranscationDetailsfromandToDate(long accountNumber,LocalDateTime fromDate,LocalDateTime toDate);
	List<Transaction> getTranscationAfterLastUpdate(long accountNumber,LocalDateTime lastUpdateDate);
	List<Transaction> getTranscationDetails(long accountNumber);

}
