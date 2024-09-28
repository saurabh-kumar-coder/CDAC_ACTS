package com.entity;

import java.util.Date;

public abstract class Account {
	private static int counter = 0;
	private int accountNo;
	private String accountName;
	private Date dateOfOpening = new Date();
	private double amount;
	public Account() {
		counter++;
	}
	public Account(int accountNo, String accountName, double amount) {
		this.accountNo = counter;
		this.accountName = accountName;
		this.amount = amount;
		counter++;
		System.out.println("counter is : "+counter);
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Date getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public static int getCounter() {
		return counter;
	}
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountName=" + accountName + ", dateOfOpening=" + dateOfOpening
				+ ", amount=" + amount + "]";
	}
	
	public abstract double applyInterest();
	
}
