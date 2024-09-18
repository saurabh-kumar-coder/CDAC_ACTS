/*
Create MobilePhone class with serialNo, modelNo, brandName and price.
Write menu driven program with below options
1. Add /write MobilePhone to file
2. Read all Mobile phones from file and store them in an array
3. Read all Mobile phones from file and store them in an array and display
sorted by price.
*/
#include<iostream>
#include<cstring>
#include<fstream>
using namespace std;

class Mobile {
	private:
		string serialNo;
		string modelNo;
		string brandName;
		string price;
	public:
		string Accept() {
			cout<<"enter serial no : "<<endl;
			getline(cin,serialNo);
			cout<<"enter model no : "<<endl;
			getline(cin, modelNo);
			cout<<"enter Brand Name : "<<endl;
			getline(cin, brandName);
			cout<<"enter Price : "<<endl;
			getline(cin, price);
			return serialNo + " " + modelNo + " " + brandName + " " + price;
		}
};

int main() {
	Mobile *m = new Mobile[10];
	Mobile copyMobile[10]; 
	fstream file("mobile.txt", ios::in | ios::out | ios::app);
	string data = m->Accept();
	if(!file.is_open()) {
		cout<<"file not open"<<endl;
	} else {
		cout<<"file opened"<<endl;
		file<<data<<endl;
		cout<<"data entered"<<endl;
	}
	
	file.seekg(0);
	cout<<"reading data from file using strings*************"<<endl;
	int ctr = 0;
	string line;
	while(file.good()) {
		ctr++;
		getline(file, line);
		cout<<line<<endl;
	}
	file.clear();
	file.seekg(0);
	cout<<"read character by character*************"<<endl;
	char ch;
	while(file.get(ch)) {
		cout<<ch;
		if(ch == '\n')
			cout<<"";
	}
	file.close();
	return 0;
}















