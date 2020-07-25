package com.cg.pecuniabank.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.pecuniabank.entity.Transaction;

public class TransactionDaoImp implements TransactionDao{
	
	@Autowired
	EntityManager entityManager;

	@Override
	public void insertTranscationDetails(Transaction transcation) {
		entityManager.persist(transcation);
		
	}

	@Override
	public List<Transaction> getTranscationDetailsfromandToDate(long accountNumber, LocalDateTime fromDate,
			LocalDateTime toDate) {
		Query query=entityManager.createQuery("SELECT t FROM Transaction t WHERE t.accountNumber =: accountNumber AND t.transactionDate BETWEEN :fromDate AND :toDate");
		query.setParameter("accountNumber",accountNumber);
		query.setParameter("fromDate", fromDate);
		query.setParameter("toDate", toDate);
		
		@SuppressWarnings("unchecked")
		List<Transaction> transactions = query.getResultList();
		return transactions;
	}

	@Override
	public List<Transaction> getTranscationAfterLastUpdate(long accountNumber, LocalDateTime lastUpdateDate) {
		Query query=entityManager.createQuery("select t from Transaction t WHERE t.accountNumber =:accountNumber and t.transactionDate > :lastUpdateDate");
		query.setParameter("accountNumber", accountNumber);
		query.setParameter("lastUpdateDate",lastUpdateDate);
		return query.getResultList();
	}

	@Override
	public List<Transaction> getTranscationDetails(long accountId) {
		Query query=entityManager.createQuery("select t from Transaction t where t.accountNumber=:accountNumberParam");
		query.setParameter("accountNumberParam", accountId);
		return query.getResultList();	
	}

}
