package com.InvesterManagementSystem.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.InvesterManagementSystem.entity.Investor;
import com.InvesterManagementSystem.service.InvestorService;



@Controller
public class InvestorControllor {

	@Autowired
	InvestorService service;
	
	@GetMapping("/investors")
	public String getAllInvestors(Model model) {
		model.addAttribute("investors", service.getAllInvestors());
		return "investors";	
	}
	
	@GetMapping("/investors/new")
	public String createInvestor(Model model) {
		Investor investor = new Investor();
		model.addAttribute("investor", investor);
		return "create_investor";
	}
	
	@PostMapping("/investors")
	public String saveInvestor(@ModelAttribute("investor") Investor investor) {
		service.saveInvestor(investor);
		return "redirect:/investors";
	}
	
	@GetMapping("/investors/edit/{ShareId}")
	public String editInvestorForm(@PathVariable Long ShareId , Model model) {
		model.addAttribute("investor", service.getInvestorById(ShareId));
		return "edit_investor";
	}
	
	@PostMapping("/investor/{ShareId}")
	public String updateInvestor(@PathVariable Long ShareId, 
			@ModelAttribute("investor") Investor investor, Model model) {
		
		Investor existingInvestor = service.getInvestorById(ShareId);
		existingInvestor.setShareId(investor.getShareId());
		existingInvestor.setShareName(investor.getShareName());
		existingInvestor.setSharePrice(investor.getSharePrice());
		existingInvestor.setNoOfShare(investor.getNoOfShare());
		existingInvestor.setTotalPrice(investor.getTotalPrice());
		service.saveInvestor(existingInvestor);
		
		return "redirect:/investors";

	}
	@GetMapping("/investor/{ShareId}")
	public String deleteInvestor(@PathVariable Long ShareId) {
		service.deleteInvestorById(ShareId);
		return "redirect:/investors";
	}
	

	
}
