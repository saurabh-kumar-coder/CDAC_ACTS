#include<iostream>
using namespace std;
class Account {
		int accountNo;
		string name;
		double balance;
	public : 
		static int counter;
		Account();
		
		Account(int accountNo, string name, double balance);

		void Accept(int accountNo, string name, double balance);
		void Display();
		
		void Withdrawl(double withdrawl);
		
		void Deposit(double deposit);
};

//int Account::counter = 301;

//void showMenu();

