package com.InvesterManagementSystem.service;

import java.util.List;

import com.InvesterManagementSystem.entity.Investor;

public interface InvestorService {

	List<Investor> getAllInvestors();
	Investor saveInvestor(Investor investor);
	Investor getInvestorById(Long ShareId);
	Investor updateInvestor(Investor investor);
	void deleteInvestorById(Long ShareId);
	
}
