#include<iostream>
#include<string>
using namespace std;

class Address {
	private:
		string houseNo;
		string area;
		string pinNo;
	public:
		Address() : houseNo(""), area(""), pinNo("") {}
		Address(string houseNo, string area, string pinNo) : houseNo(houseNo), area(area), pinNo(pinNo) {}
		void Accept() {
			cout<<"enter Address Data : "<<endl;
			cout<<"house no is : "<<endl;
			cin>>houseNo;
			cout<<"house area is : "<<endl;
			cin>>area;
			cout<<"house pin no is : "<<endl;
			cin>>pinNo;
		}
		void Display() {
			cout<<" House Data is : "<<endl;
			cout<<" house no : "<<houseNo<<endl;
			cout<<" house area : "<<area<<endl;
			cout<<" house pin no is : "<<pinNo<<endl;
		}
};
