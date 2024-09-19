#include "Array.h"
Array::Array() {
	size = 0;
}
Array::Array(int size) : size(size) {
	ptr = new int[size];
}
void Array::Accept() {
	cout<<"size is : "<<endl;
	cin>>size;
}
void Array::Display() {
	cout<<"Display called : "<<endl;
}

void Array::setArray(int idx, int value) {
//	cout<<"Value : "<<value<<endl;
	ptr[idx] = value;
}

int Array::getArray(int idx) {
//	cout<<"Value : "<<ptr[idx]<<endl;
	return ptr[idx];
}

int & Array::operator[](int idx) {
	return ptr[idx];
}

Array Array::operator+(Array arr) {
	int s = this->size + arr.size;
	Array a(s);
	for(int i = 0; i < s; i++) {
		if(i < this->size) {
			a[i] = ptr[i];
		} else {
			a[i] = arr[i - this->size];
		}
	}
	return a;
}

Array::~Array(){
	cout<<"Destructor called "<<endl;
	delete[] ptr;
}
