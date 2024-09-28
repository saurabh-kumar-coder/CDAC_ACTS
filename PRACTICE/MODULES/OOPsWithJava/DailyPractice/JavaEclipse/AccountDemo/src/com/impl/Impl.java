package com.impl;

import java.util.Scanner;

import com.entity.Account;
import com.entity.CurrentAccount;
import com.entity.DepositAccount;
import com.entity.SavingAccount;

public class Impl {
	public static void showMenu() {
		System.out.println("What you want to do ?\n" + "1 Create Saving account\n" + "2 Create Current account\n"
				+ "3 Create Deposit account\n" + "4 Search details of an account");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] account = new Account[5];
		char ch = 0;
		do {
			showMenu();
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			double amt;
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("enter name : ");
				String name = sc.nextLine();
				System.out.println("enter amt : ");
				double amt1 = sc.nextDouble();
				account[Account.getCounter()] = new SavingAccount(name, amt1);
				System.out.println(account[Account.getCounter() - 1].applyInterest());
				System.out.println(account[Account.getCounter() - 1].toString());
				System.out.println("amount after interest is : " + account[Account.getCounter() - 1].applyInterest());
			}
				break;
			case 2: {
				System.out.println("enter name : ");
				String name = sc.nextLine();
				System.out.println("enter amt : ");
				double amt1 = sc.nextDouble();
				account[Account.getCounter()] = new CurrentAccount(name, amt1);
				System.out.println(account[Account.getCounter() - 1].applyInterest());
				System.out.println(account[Account.getCounter() - 1].toString());
				System.out.println("amount after interest is : " + account[Account.getCounter() - 1].applyInterest());

			}
				break;
			case 3: {
				System.out.println("enter name : ");
				String name = sc.nextLine();
				System.out.println("enter amt : ");
				double amt1 = sc.nextDouble();
				account[Account.getCounter()] = new DepositAccount(name, amt1);
				System.out.println(account[Account.getCounter() - 1].toString());
				System.out.println("amount after interest is : " + account[Account.getCounter() - 1].applyInterest());
			}
				break;
			case 4: {
				System.out.println("Enter Account no you want to search : ");
				int accNo = sc.nextInt();
				for (int i = 0; i < account.length && account[i] != null; i++) {
					if (account[i].getAccountNo() == accNo) {
						System.out.println("found");
						if (account[i] instanceof SavingAccount) {
							System.out.println(account[i].toString());
							System.out.println("Saving");
						}
						if (account[i] instanceof CurrentAccount) {
							System.out.println(account[i].toString());
							System.out.println("Current");
						}
						if (account[i] instanceof DepositAccount) {
							System.out.println(account[i].toString());
							System.out.println("Deposit");
						}
					}
				}
			}
				break;
			default: {
				System.out.println("you entered wrong choice :");
			}
			}
			System.out.println("Do you want to continue(press y)...");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		sc.close();
	}
}
