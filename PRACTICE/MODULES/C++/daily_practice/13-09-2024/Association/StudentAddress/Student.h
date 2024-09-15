#include<iostream>
#include<string>
#include "Address.h"
//using namespace std;

class Student {
	private:
		int rollNo;
		string name;
		Address address;
	public:
		Student();
		Student(int rollNo, string name, Address address);
		void Accept();
		void Display();
};
