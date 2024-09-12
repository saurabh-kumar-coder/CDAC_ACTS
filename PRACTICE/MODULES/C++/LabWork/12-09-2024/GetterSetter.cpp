#include<iostream>
using namespace std;

class Student {
	int size;
	string name;
	int *ptr;
	
	public:
	Student(): size(0), name("") {}
	
	Student(int size, string name): size(size), name(name) {
		ptr = new int[5];
	}
	
	Student(int size) {
		this->size = size;
		ptr = new int[size];
	}
	
	void setSize(int size) {
		this->size = size;
	}
	
	int getSize() {
		return size;
	}
	
	void setName(string name) {
		this->name = name;
	}
	
	string getName() {
		return name;
	}
	
	void setPtr(int idx, int val) {
		ptr[idx] = val;
	}
	
	int getPtr(int idx) {
		return ptr[idx];
	}
	
	
	
};

int main() {
	Student s(2);
	for(int i = 0; i < 2; i++) 
		s.setPtr(i, 5);
	for(int i = 0; i < 2; i++)
		cout<<s.getPtr(i)<<endl;
	return 0;
}
