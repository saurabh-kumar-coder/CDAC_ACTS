package com.impl;

import java.util.Scanner;

import com.entity.Account;
import com.entity.CurrentAccount;
import com.entity.DepositAccount;
import com.entity.SavingAccount;

public class Impl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] account = new Account[5]; 
		char ch = 0;
		do {
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			double amt;
			switch (choice) {
				case 1: {
					account[Account.getCounter()] = new SavingAccount();
					System.out.println(account[Account.getCounter()]);
					System.out.println("Enter Amount :");
					account[Account.getCounter()].setAmount(sc.nextDouble());
					amt = account[Account.getCounter()].applyInterest();
					System.out.println("Account Number is : "+account[Account.getCounter()].getAccountNo());
					System.out.println("Opening date is : " + account[Account.getCounter()].getDateOfOpening());
					System.out.println("Saving Account : " + amt);
				}
				break;
				case 2: {
					System.out.println("Enter Amount : ");
					account[Account.getCounter()] = new CurrentAccount();
					account[Account.getCounter()].setAmount(sc.nextDouble());
					amt = account[Account.getCounter()].applyInterest();
					System.out.println("Account Number is : "+account[Account.getCounter()].getAccountNo());
					System.out.println("Opening date is : " + account[Account.getCounter()].getDateOfOpening());
					System.out.println("Saving Account : " + amt);
				}
				break;
				case 3: {
					account[Account.getCounter()] = new DepositAccount();
					amt = account[Account.getCounter()].applyInterest();
					System.out.println("Account Number is : "+account[Account.getCounter()].getAccountNo());
					System.out.println("Opening date is : " + account[Account.getCounter()].getDateOfOpening());
					System.out.println("Saving Account : " + amt);
				}
				break;
				default : {
					System.out.println("you entered wrong choice :");
				}
			}
			System.out.println("Do you want to continue(press y)...");
			ch = sc.next().charAt(0);
		} while(ch == 'y' || ch == 'Y');
		sc.close();
	}
}
