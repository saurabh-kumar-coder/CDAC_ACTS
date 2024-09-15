#include<iostream>
#include "Address.h"
#include<string>
using namespace std;

Address::Address(): houseNo(""), area(""), pinCode("") {}
Address::Address(string houseNo, string area, string pinCode) : houseNo(houseNo), area(area), pinCode(pinCode) {}
void Address::Accept() {
	cout<<"Enter House Details : "<<endl;
	cout<<"house number : "<<endl;
	cin>>houseNo;
	cout<<"AREA : "<<endl;
	cin>>area;
	cout<<"Pin Code Number : "<<endl;
	cin>>pinCode;
}
void Address::Display() {
	cout<<"Displaying Address of Student : "<<endl;
	cout<<"HOUSE NO is : "<<houseNo<<endl;
	cout<<"AREA is : "<<area<<endl;
	cout<<"PIN Code is : "<<pinCode<<endl;
}
