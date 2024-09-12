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
	
	int & at(int index) {
		return ptr[index];
	}
	/*
	void setPtr(int idx, int val) {
		ptr[idx] = val;
	}
	
	int getPtr(int idx) {
		return ptr[idx];
	}
	*/
	
	~Student() {
		cout<<"destructor called.."<<endl;
		delete[] ptr;
	}
	
};

int main() {
	Student s(2);
	s.at(0) = 10;
	s.at(1) = 20;
	cout<<s.at(0)<<endl;
	cout<<s.at(1)<<endl;
	return 0;
}

/*
	In this program, we have removed the getter setter and created only one method.
	int & at(int index) {
		return ptr[index];
	}
*/
