/*
header files and namespaces.
initialize static variable and methods using scope resolution operator.
also define global methods.
*/

#include "AccountHeader.h"
#include<iostream>
#include<stdlib.h>
using namespace std;

int Account::counter = 0;

void showMenu() {
	cout<<"1. Create Account"<<endl;
	cout<<"2. Display Account Info"<<endl;
	cout<<"3. Deposit Balance"<<endl;
	cout<<"4. Withdrawl Balance"<<endl;
	cout<<"5. EXIT"<<endl;
}

int main() {
	Account account[20];
	char ch;
	int accountNo;
	string name;
	double balance;
//	static int counter;
	
	do{
		showMenu();
		int choice;
		cout<<"enter your choice : ";
		cin>>choice;
		switch(choice) {
			case 1:
				cout<<"Creating Account : "<<endl;
				cout<<"enter name : ";
				cin>>name;
				cout<<"enter balance : ";
				cin>>balance;
				account[Account::counter].Accept(Account::counter ,name, balance);
				account[Account::counter].Display();
				Account::counter++;
				break;
			case 2:
				cout<<"Display Account Info : "<<endl;
				cout<<"enter your account no : ";
				int accNo;
				cin>>accNo;
				//account[Account::counter].Display();
				account[accNo].Display();
				break;
			case 3:
				cout<<"Deposit Balance : "<<endl;
				cout<<"enter your account no : ";
				accNo;
				cin>>accNo;
				cout<<"enter amount to add : ";
				double amt;
				cin>>amt;
				account[accNo].Deposit(amt);
				account[accNo].Display();
				break;
			case 4:
				cout<<"Withdrawl Balance : "<<endl;
				cout<<"enter your account no : ";
				accNo;
				cin>>accNo;
				cout<<"enter amount to withdrawl : ";
				amt;
				cin>>amt;
				account[accNo].Withdrawl(amt);
				account[accNo].Display();
				break;
			case 5:
				cout<<"EXIT : "<<endl;
				exit(1);
				break;
			default :
				cout<<"you entered wrong choice.."<<endl;
		}
		cout<<"do you want to continue banking(press y)..";
		cin>>ch;
	}while(ch == 'y' || ch == 'Y');
}



