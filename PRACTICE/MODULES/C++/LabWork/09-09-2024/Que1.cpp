#include<iostream>
#include<string>
using namespace std;

class Student{

	int rollNo;
	string name;
	const string country;
	
	public:
	
	Student(): rollNo(0), name(""), country("India"){
	cout<<"Default constructor ==>";
	cout<<"Value of this pointer: "<<this<<endl; 
	}
	
	Student(int rollNo, string name, string country): rollNo(rollNo), name(name), country(country){
	cout<<"Parameterized constructor ==>";
	cout<<"Value of this pointer: "<<this<<endl;
	}
	
	void Accept(int rollNo, string name){
	
	this->rollNo = rollNo;
	this->name = name;
	}
	
	void Display(){
	
	cout<<"Roll No:"<<this->rollNo<<endl;
	cout<<"Name:"<<this->name<<endl;
	cout<<"Country"<<this->country<<endl;
	}
};

int main(){

	Student *s1 = new Student;
	Student *s2 = new Student(1,"abc","India");
	
	cout<<"Default constructor call five times for array 5 times using DMA"<<endl;
	
	Student *parr = new Student[5];
	
	cout<<"Default constructor call five times for normal array 5 times"<<endl;
	
	Student arr[5];
	
	return 0;
}
