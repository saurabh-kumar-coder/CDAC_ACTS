#include<iostream>
#include<string>
using namespace std;
void gettingInputFromUser() {
    int a;
    cout<<"enter integer value : ";
    cin>>a;
    cout<< "entered value of a is : " <<a;
}
void addTwoString(){
    string s1 = "hello";
    string s2 = " world";
    cout<< "\n" << s1 + s2;
}
void stringWithInt(){
    // cannot use String with int, we need to typecase int to string
    string x = "20";
    int y = 10;
    cout<< x + to_string(y);
    // cout<< x.append(y);
    // cout<< y + x;
    // cout<< y.append(x);
}
void stringInput() {
    string s1, s2;
    cout<<"enter string1";
    cin>>s1;
    cout<<s1;
    cin.ignore();
    cout<<"\n";
    cout<<"enter string2";
    getline(cin, s2);
    cout<<s2;
}
int main() {
    // gettingInputFromUser();
    // cout<<"\n";
    // addTwoString();
    // cout<<"\n";
    // stringWithInt();
    // cout<<"\n";
    stringInput();
    return 0;
}
