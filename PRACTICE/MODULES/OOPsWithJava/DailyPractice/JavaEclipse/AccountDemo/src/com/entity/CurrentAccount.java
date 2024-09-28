package com.entity;


public class CurrentAccount extends Account {
	double interestRate = 1;
	
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accountName, double amount) {
		super(accountName, amount);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double interestRate) {
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
		return super.toString() + "CurrentAccount [interestRate=" + interestRate + "]";
	}	
}
