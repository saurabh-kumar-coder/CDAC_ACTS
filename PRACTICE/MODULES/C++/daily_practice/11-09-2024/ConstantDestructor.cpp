#include<iostream>
using namespace std;

class Student {
	private:
		int rno;
		string name;
		const string location = "Delhi";
		int * ptr;
	public:
		Student() : rno(0), name(""), location("") {
			cout<<"Default ctor called..."<<endl;
			new Student(3, "poor", "location");
			cout<<"ENDING DEFAULT CTOR..."<<endl;
		}
		Student(int rno, string name, string location) : rno(rno), name(name), location(location) {
			ptr = new int[rno];
			cout<<"parameterized constructor called..."<<endl;
			cout<<"Rno : "<<this->rno<<" name : "<<this->name<<" location : "<<this->location<<endl;
		} 
		void Accept() {
			cout<<"Accept method called..."<<endl;
		}
		void Display() {
			cout<<"Display method called..."<<endl;
		}
		~Student() {
			cout<<"Destructor called...##############"<<endl;
			cout<<this<<endl;
			delete ptr;
		}
};

int main() {
	Student s;
	Student s1(2, "shyam", "location");
	return 0;
}
