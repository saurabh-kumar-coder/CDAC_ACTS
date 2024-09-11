#include<iostream>
#include "Account.h"
#include<stdlib.h>
using namespace std;
static int counter;
Account::Account() : accountNo(0), name(""), balance(0.00) {}

Account::Account(int accountNo, string name, double balance) : accountNo(accountNo), name(name), balance(balance) {}

void Account::Accept(int accountNo, string name, double balance) {
	this->accountNo = accountNo;
	this->name = name;
	this->balance = balance;
}
void Account::Display() {
	cout<<"account number is : "<<this->accountNo<<endl;
	cout<<"name is : "<<this->name<<endl;
	cout<<"balance is : "<<this->balance<<endl;
}

void Account::Withdrawl(double withdrawl) {
	cout<<"welcome to withdrawl : "<<endl;
	balance -= withdrawl;
}

void Account::Deposit(double deposit) {
	cout<<"welcome to Deposite : "<<endl;
	balance += deposit;
}

