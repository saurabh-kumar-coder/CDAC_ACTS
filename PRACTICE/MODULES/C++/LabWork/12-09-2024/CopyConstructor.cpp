#include<iostream>
using namespace std;

class Student {
	int size;
	int *ptr;
	
	public:
	Student():size(0) {} 
	
	Student(int size) {
		this->size = size;
		ptr = new int[size];
	}
	
	Student(const Student &x) {
		this->size = x.size;
		ptr = new int[size];
		for(int i = 0; i < size; i++) {
			ptr[i] = x.ptr[i];
		}
	}
	
	void setSize(int size) {
		this->size = size;
	}
	
	int getSize() {
		return size;
	}
	
	void setPtr(int idx, int val) {
		ptr[idx] = val;
	}
	
	int getPtr(int idx) {
		return ptr[idx];
	}
	
	~Student() {
		cout<<"destructor called.."<<endl;
		delete[] ptr;
	}
	
};

int main() {
	Student s(2);
	
	for(int i = 0; i < 2; i++) 
		s.setPtr(i, 5);
	for(int i = 0; i < 2; i++)
		cout<<s.getPtr(i)<<endl;
	{
		Student ss(s);
		for(int i = 0; i < 2; i++) 
			ss.setPtr(i, 5);
		for(int i = 0; i < 2; i++)
			cout<<ss.getPtr(i)<<endl;
	}
	
	for(int i = 0; i < 2; i++)
		cout<<s.getPtr(i)<<endl;
	
	return 0;
}

/*

	this will give issue...
	for this we need to implement copy constructor.

*/

