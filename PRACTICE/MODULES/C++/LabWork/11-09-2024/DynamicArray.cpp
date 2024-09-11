#include<iostream>
using namespace std;

class DynamicArray {
	int *ptr;
	int const size;
	public:
		DynamicArray(int size) : size(size) {
			ptr = new int[size];
		}
		void Accept() {
			cout<<"enter array element : "<<endl;
			for(int i = 0; i < size; i++) {
				cin>>ptr[i];
			}
		}
		void Display() {
			cout<<"Array element are : "<<endl;
			for(int i = 0; i < size; i++) 
				cout<<*(ptr+i)<<" ";
		}
};

int main() {
	DynamicArray arr(3);
	arr.Accept();
	arr.Display();
	return 0;
}
