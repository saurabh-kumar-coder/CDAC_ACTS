#include<iostream>
#include "Student.h"
#include<fstream>
using namespace std;
int main() {
	Student s;
	s.Accept();
	fstream file("student.bin", ios::binary | ios::app);
	file.write((char*)&s, sizeof(Student));
	s.Display();
	Student s1;
	cout<<"reading"<<endl;
	file.close();
	ifstream file1("student.bin", ios::binary);
	while(file1.read((char*)&s1, sizeof(Student))) {
		s1.Display();
	}
	file1.close();	
}
