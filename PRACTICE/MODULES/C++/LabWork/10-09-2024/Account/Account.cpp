#include<iostream>
#include "Account.h"
#include<stdlib.h>
using namespace std;
static int counter;
Account() : accountNo(0), name(""), balance(0.00) {}

Account(int accountNo, string name, double balance) : accountNo(accountNo), name(name), balance(balance) {}

void Accept(int accountNo, string name, double balance) {
	this->accountNo = accountNo;
	this->name = name;
	this->balance = balance;
}
void Display() {
	cout<<"account number is : "<<this->accountNo<<endl;
	cout<<"name is : "<<this->name<<endl;
	cout<<"balance is : "<<this->balance<<endl;
}

void Withdrawl(double withdrawl) {
	cout<<"welcome to withdrawl : "<<endl;
	balance -= withdrawl;
}

void Deposit(double deposit) {
	cout<<"welcome to Deposite : "<<endl;
	balance += deposit;
}


//int Account::counter = 0;

void showMenu() {
	cout<<"1. Create Account"<<endl;
	cout<<"2. Display Account Info"<<endl;
	cout<<"3. Deposit Balance"<<endl;
	cout<<"4. Withdrawl Balance"<<endl;
	cout<<"5. EXIT"<<endl;
}
