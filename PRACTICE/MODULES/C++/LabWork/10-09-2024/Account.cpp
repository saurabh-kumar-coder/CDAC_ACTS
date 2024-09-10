
using namespace std;
class Account {
		int accountNo;
		string name;
		double balance;
	public : 
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
};

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



