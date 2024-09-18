#include<iostream>
#include<string>
//using namespace std;

class Student {
	private:
		char rollNo[20];
		char name[20];
		char area[20];
	public:
		Student();
		Student(char rollNo[], char name[], char area[]);
		void Accept();
		void Display();
};
