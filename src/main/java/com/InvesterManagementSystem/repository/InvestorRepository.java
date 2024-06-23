package com.InvesterManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InvesterManagementSystem.entity.Investor;

public interface InvestorRepository extends JpaRepository <Investor, Long>{
	

}
