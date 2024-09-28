package com.entity;

public class SavingAccount extends Account {
	double interestRate = 3;
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(String accountName, double amount) {
		super(accountName, amount);

	}

	public SavingAccount(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double applyInterest() {
		double calInterest = (getAmount() * getInterestRate()) / 100;
		return calInterest;
	}

	@Override
	public String toString() {
		return super.toString() + "SavingAccount [interestRate=" + interestRate + "]";
	}

//	@Override
//	public String toString() {
//		return "SavingAccount [interestRate=" + interestRate + ", getAccountNo()=" + getAccountNo()
//				+ ", getAccountName()=" + getAccountName() + ", getDateOfOpening()=" + getDateOfOpening()
//				+ ", getAmount()=" + getAmount() + "]";
//	}
	
	
	
}
