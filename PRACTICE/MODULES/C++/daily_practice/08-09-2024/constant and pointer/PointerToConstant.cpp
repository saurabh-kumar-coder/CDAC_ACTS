#include<iostream>
using namespace std;


int main() {
	int num1 = 10;
	int num2 = 20;
	const int* ptr = &num1;		// pointer to a constant int
	cout<<"*ptr : "<<*ptr<<endl;
//	*ptr = 30;			// *ptr is constant // error: assignment of read-only location ‘* ptr’
//	cout<<"*ptr : "<<*ptr<<endl;
	ptr = &num2;
	cout<<"*ptr : "<<*ptr<<endl;	 
	return 0;
}
