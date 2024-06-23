package com.InvesterManagementSystem.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InvesterManagementSystem.entity.Investor;
import com.InvesterManagementSystem.repository.InvestorRepository;
import com.InvesterManagementSystem.service.InvestorService;

@Service
public class InvestorServiceImpl implements InvestorService {
	
	@Autowired
	InvestorRepository repository;
	
//	public InvestorServiceImpl(InvestorRepository repository) {
//		super();
//		this.repository = repository;
//	}
	
	@Override
	public List<Investor> getAllInvestors() {
		return repository.findAll();
	}

	@Override
	public Investor saveInvestor(Investor investor) {
		return repository.save(investor);
	}

	@Override
	public Investor getInvestorById(Long ShareId) {	
		return repository.findById(ShareId).get();
	}

	@Override
	public Investor updateInvestor(Investor investor) {
		return repository.save(investor);
	}

	@Override
	public void deleteInvestorById(Long ShareId){	
		 repository.deleteById(ShareId);
	}

}
