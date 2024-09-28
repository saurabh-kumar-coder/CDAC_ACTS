package com.entity;


public class CurrentAccount extends Account {
	double interestRate = 1;
	
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int accountNo, String accountName, double amount) {
		super(accountNo, accountName, amount);
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
}
