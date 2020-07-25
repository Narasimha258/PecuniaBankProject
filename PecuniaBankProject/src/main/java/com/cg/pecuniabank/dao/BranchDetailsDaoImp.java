package com.cg.pecuniabank.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.pecuniabank.entity.BranchDetails;
@Repository
public class BranchDetailsDaoImp implements BranchDetailsDao{
	
	@Autowired
	EntityManager entityManager;

	@Override
	public void insertBranchDetails(BranchDetails branchDetails) {
		entityManager.persist(branchDetails);
	}

}
