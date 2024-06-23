package com.InvesterManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.InvesterManagementSystem.entity.Investor;
import com.InvesterManagementSystem.repository.InvestorRepository;

@SpringBootApplication
public class InvesterManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(InvesterManagementSystemApplication.class, args);
	}
	
	@Autowired
	InvestorRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
	}	
}
