package com.cg.pecuniabank.dao;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.pecuniabank.entity.PassbookUpdate;

@Repository
public class PassbookDaoImp implements PassbookDao{
	
	@Autowired
	EntityManager entityManager;

	@Override
	public void passbookUpdateChangeLastUpdate(long accountNumber, LocalDateTime lastUpdatedDate) {
		Query query = entityManager.createQuery("UPDATE PassbookUpdate SET lastUpdate = :lastUpdatedDate WHERE accountNumber=:accountNumber");
		query.setParameter("lastUpdatedDate", lastUpdatedDate);
		query.setParameter("accountNumber", accountNumber);
		query.executeUpdate();
		
	}

	@Override
	public PassbookUpdate passbookUpdateDetailsByAccountNumber(long accountNumber) {
		return entityManager.find(PassbookUpdate.class, accountNumber);
	}

	@Override
	public void passbookUpdateNewEntry(PassbookUpdate passbookUpdate) {
		entityManager.persist(passbookUpdate);
		
	}




}
