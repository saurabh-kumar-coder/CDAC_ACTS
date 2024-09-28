package com.entity;

public class SavingAccount extends Account {
	double interestRate = 3;
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accountNo, String accountName, double amount) {
		super(accountNo, accountName, amount);
		// TODO Auto-generated constructor stub
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
}
