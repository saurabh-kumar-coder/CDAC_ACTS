#include "Header.h"
using namespace std;

Student::Student():rno(0), name(""){}
Student::Student(int rno, string name): rno(rno), name(name) {}

void Student::Accept() {
	cout<<"enter Data"<<endl;
}
void Student::Display() {
	cout<<"showing data"<<endl;
}
