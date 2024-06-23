package com.InvesterManagementSystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Investor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ShareId;
	private String ShareName;
	private double SharePrice;
	private double NoOfShare;
	private double TotalPrice;
	private LocalDate IssueDate;
	
	public Long getShareId() {
		return ShareId;
	}

	public void setShareId(Long shareId) {
		ShareId = shareId;
	}

	public String getShareName() {
		return ShareName;
	}

	public void setShareName(String shareName) {
		ShareName = shareName;
	}

	public double getSharePrice() {
		return SharePrice;
	}

	public void setSharePrice(double sharePrice) {
		SharePrice = sharePrice;
	}

	public double getNoOfShare() {
		return NoOfShare;
	}

	public void setNoOfShare(double noOfShare) {
		NoOfShare = noOfShare;
	}

	public double getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}

	public LocalDate getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		IssueDate = issueDate;
	}

	public Investor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Investor(Long shareId, String shareName, double sharePrice, double noOfShare, double totalPrice,
			LocalDate issueDate) {
		super();
		ShareId = shareId;
		ShareName = shareName;
		SharePrice = sharePrice;
		NoOfShare = noOfShare;
		TotalPrice = totalPrice;
		IssueDate = issueDate;
	}

}
