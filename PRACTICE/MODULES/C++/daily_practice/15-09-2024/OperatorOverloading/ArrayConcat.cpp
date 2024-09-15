#include<iostream>
using namespace std;

class Array {
	private: 
		int size;
		int * ptr;
	public:
		Array() : size(0) {}
		Array(int size) : size(size) {
			ptr = new int[size];
		}
		
		int & operator[] (int idx) const {
			return ptr[idx];
		}
		
		Array operator+(const Array arr) const {
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
		void setArr(int i, int value) {
			ptr[i] = value;
		}
		int getArr(int i) {
			return ptr[i];
		}
		~Array() {
			cout<<"destuctor"<<endl;
			delete[] ptr;
		}
};

int main() {
	Array a1(2);
	Array a2(3);
	for(int i = 0; i < 2; i++) {
		a1.setArr(i, 5);
	}
	for(int i = 0; i < 2; i++) {
		cout<<"a1 : "<<i<<" "<<a1.getArr(i)<<endl;
	}
	
	for(int i = 0; i < 3; i++) {
		a2.setArr(i, 6);
	}
	for(int i = 0; i < 3; i++) {
		cout<<"a2 : "<<i<<" "<<a2.getArr(i)<<endl;
	}
	Array a3 = a1 + a2;
	for(int i = 0; i < 5; i++) {
		cout<<a3.getArr(i)<<endl;
	}
	return 0;
}
