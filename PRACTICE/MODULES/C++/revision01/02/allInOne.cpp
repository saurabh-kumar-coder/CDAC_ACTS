#include<iostream>
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
int main() {
    gettingInputFromUser();
    addTwoString();
    return 0;
}
