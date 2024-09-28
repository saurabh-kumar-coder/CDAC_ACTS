package com.entity;

public class DepositAccount extends Account {
	double interestRate = 8;

	public DepositAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepositAccount(String accountName, double amount) {
		super(accountName, amount);
		// TODO Auto-generated constructor stub
	}

	public DepositAccount(double interestRate) {
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
		return super.toString() + "DepositAccount [interestRate=" + interestRate + "]";
	}
	
}
