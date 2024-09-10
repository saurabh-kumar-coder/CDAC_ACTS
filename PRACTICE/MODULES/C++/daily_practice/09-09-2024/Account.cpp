// Implement constructor, parameterized constructor ,  Accept, Display functions in Account class.
// Try to create Account objects using new operator.
// Provide option to add an account to array for open account  and display account details.
// Print this pointer inside function to check if it points to invoking object.
// Write menu driven program for this. Find account and do transactions like withdraw and deposit

#include <iostream>
using namespace std;

class Account
{
private:
    int id;
    string name;
    float balance;

public:
    
    // ctor
    Account() : id(0), name(""), balance(0.00f) {}

    Account(int id, string name, float balance) : id(id), name(name), balance(balance) {}

    // methods
    void Display()
    {
        cout << "Account No: " << id << endl;
        cout << "Name: " << name << endl;
        cout << "Balance: " << balance << endl;
    }
    void Accept(int id, string name, float balance)
    {
        this->id = id;
        this->name = name;
        this->balance = balance;
    }
    int getBalance(Account *acc)
    {
        int balance = 0;
    }
};

// Provide option to add an account to array for open account  and display account details.
// Print this pointer inside function to check if it points to invoking object.
// Write menu driven program for this. Find account and do transactions like withdraw and deposit
void showMenu()
{
    cout << "Menu : " << endl;
    cout << "1. ADD ACCOUNT" << endl;
    cout << "2. DISPLAY ACCOUNT DETAILS" << endl;
    cout << "3. WITHDRAW BALANCE" << endl;
    cout << "4. DEPOSIT BALANCE" << endl;
    cout << "5. EXIT" << endl;
}
int main()
{
    // Try to create Account objects using new operator.
    Account *account = new Account[10];
    char ch;
    do
    {
        showMenu();
        cout << "Enter your choice : ";
        char choice;
        cin >> choice;
        int num = 0;
        int id;
        string name;
        float balance;
        switch (choice)
        {
        case '1':
        {
            cout << "ADD ACCOUNT" << endl;
            // cout << "enter your id";
            // cin >> id
            cout << "enter your name : ";
            cin >> name;
            cout << "enter the amount : ";
            cin >> balance;
            account[num].Accept(num, name, balance);
            break;
        }
        case '2':
        {
            cout << "DISPLAY ACCOUNT DETAILS" << endl;
            cout << "Enter account id : " << endl;
            int no;
            cin >> no;
            account[no].Display();
            break;
        }
        case '3':
        {
            cout << "WITHDRAW BALANCE" << endl;
            cout << "Enter account id : " << endl;
            int no;
            cin >> no;
            cout << "Enter amount to be withdrawl : ";
            int withdrawl;
            cin >> withdrawl;
            // int bal = getBalance(&account);
            // cout << "BALANCE : " << bal;
            break;
        }
        case '4':
        {
            cout << "DEPOSIT BALANCE";
            break;
        }
        case '5':
        {
            cout << "EXIT";
            break;
        }
        default:
            cout << "WRONG CHOICE ENTERED...";
        }
        cout << "DO YOU WANT TO CONTINUE BANKING(PRESS 'y')...";
        cin >> ch;
    } while (ch == 'y' || ch == 'Y');

    return 0;
}