#include<iostream>
using namespace std;

int main() {
	int num1 = 10;
	int num2 = 20;
	int *const ptr = &num1;		// constant pointer to int
	cout<<"*ptr : "<<*ptr<<endl;
	*ptr = 30;
	cout<<"*ptr : "<<*ptr<<endl;
//	ptr = &num2;			// ptr is constant // error: assignment of read-only variable ‘ptr’
//	cout<<"*ptr : "<<*ptr<<endl;
	return 0;
}
