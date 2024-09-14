#include<iostream>
using namespace std;

int main() {
	int num1 = 10;
	int num2 = 20;
	const int *const ptr = &num1;		// Constant pointer to a constant int
	cout<<"*ptr : "<<*ptr<<endl;
//	*ptr = 30;				// *ptr is constant // Error: assignment of read-only location '*ptr'
//	cout<<"*ptr : "<<*ptr<<endl;
//	ptr = &num2;				// ptr itself is constant // Error: assignment of read-only variable 'ptr'
//	cout<<"*ptr : "<<*ptr<<endl;
	return 0;
}
