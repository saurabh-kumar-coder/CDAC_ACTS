#include <iostream>
#include <string>
using namespace std;

class Account {
    int accountNo;
    double balance;
    string name;
    
public:
    Account() : accountNo(0), balance(0), name("") {}

    Account(int accountNo, double balance, string name) 
        : accountNo(accountNo), balance(balance), name(name) {}

    void Display() {
        cout << "Name: " << name << endl;
        cout << "Balance: " << balance << endl;
        cout << "Account No: " << accountNo << endl;
    }

    void Accept(int accountNo, double balance, string name) {
        this->accountNo = accountNo;
        this->balance = balance;
        this->name = name;
    }
};

int main() {
    Account arr[100];
    
    char ch;
    int num = 0, accountNo;
    double balance;
    string name;

    do {
        cout << "Create an account" << endl;
        cout << "Enter name:"; 
        cin.ignore();
        getline(cin, name); 
        cout << "Enter Balance: ";
        cin >> balance;
        cout << "Enter Account No: ";
        cin >> accountNo;

        arr[num].Accept(accountNo, balance, name);
        num++;

        cout << "Do you want to continue (Y/N): ";
        cin >> ch;
        cin.ignore(); 

    } while (ch != 'N' && ch != 'n');

    cout << "Entered account details are:" << endl;

    for (int i = 0; i < num; i++) {
        arr[i].Display();
    }

    return 0;
}
