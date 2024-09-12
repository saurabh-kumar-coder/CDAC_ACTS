#include<iostream>
using namespace std;

class Array {
	private :
		int size;
		int * ptr;
	public :
		Array() : size(0) {}
		
		Array(int size) {
			this->size = size;
			ptr = new int[size];
		}
		
		int & operator[] (int idx) const {
			return ptr[idx];
		}
		
		Array operator+(const Array & arr) {
			int si = this->size + arr.size;
			Array a(si);
			for(int i = 0; i < si; i++) {
				if(i < this->size) {
					a[i] = ptr[i];
					cout<<"a[i] : "<<a[i]<<endl;
				} else {
					a[i] = arr[i - this->size];
					cout<<"a[i] : "<<a[i]<<endl;
				}
			}
			return a;
		} 
				
		int getPtr(int idx) {
			return ptr[idx];
		}
		
		~Array() {
			cout<<"destructor called..."<<endl;
			delete[] ptr;
		}
};

int main() {
	Array arr1(2);
	Array arr2(3);
	for(int i = 0; i < 2; i++) {
		arr1[i] = 5;
	}
	for(int i = 0; i < 3; i++) {
		arr2[i] = 6;
	}
	Array arr3 = arr1 + arr2;
	for(int i = 0; i < 5; i++) {
		cout<<arr3.getPtr(i)<<endl;
	}
	return 0;
}
