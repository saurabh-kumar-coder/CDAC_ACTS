#include<iostream>
using namespace std;

class Student {
	private:
		int rno;
		string name;
		int * ptr;
	public:
		Student() : rno(0), name("her") {
			new Student(3, "poor");
			cout<<"Default ctor called..."<<endl;
		}
		Student(int rno, string name) : rno(rno), name(name) {
			ptr = new int[rno];
			cout<<"parameterized constructor called..."<<endl;
			cout<<"Rno : "<<this->rno<<" name : "<<this->name<<" "<<endl;
		} 
		void Accept() {
			cout<<"Accept method called..."<<endl;
		}
		void Display() {
			cout<<"Display method called..."<<endl;
		}
		~Student() {
			delete [] ptr;
			cout<<this<<endl;
			cout<<this->name<<endl;
			cout<<"Destructor called...##############"<<endl;
		}
};

int main() {
	Student s;
	Student s1(2, "shyam");
	return 0;
}
