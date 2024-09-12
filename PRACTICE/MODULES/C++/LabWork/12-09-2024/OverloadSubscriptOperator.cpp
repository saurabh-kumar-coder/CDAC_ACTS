#include<iostream>
using namespace std;

class Array {
	int size;
	int *ptr;
	
	public:
	Array():size(0) {} 
	
	Array(int size) {
		this->size = size;
		ptr = new int[size];
	}
	
	Array(const Array &x) {
		this->size = x.size;
		ptr = new int[size];
		for(int i = 0; i < size; i++) {
			ptr[i] = x.ptr[i];
		}
	}
	
	int & operator[] (int index) const {
		return ptr[index];
	}
	
	Array operator+(const Array & arr) {
		int si = this->size + arr.size;
		Array array(si);
		for(int i = 0; i < si; i++) {
			if(i < this->size) {
				array[i] = ptr[i];
				cout<<array[i];
			} else {
				array[i] = arr[i - this->size];
				cout<<array[i];
			}
		}
		return array;
	}
	
	int getPtr(int idx) {
		return ptr[idx];
	}
	
	~Array() {
		cout<<"destructor called.."<<endl;
		delete[] ptr;
	}
	
};

int main() {
	Array s(2);
	Array s1(3);
	for(int i = 0; i < 2; i++)
		s[i] = 5;
	for(int i = 0; i < 3; i++)
		s1[i] = 6;
		
	Array s3 = s + s1;
	
	for(int i = 0; i < 5; i++)
		cout<<s3.getPtr(i)<<endl;
	
	return 0;
}


