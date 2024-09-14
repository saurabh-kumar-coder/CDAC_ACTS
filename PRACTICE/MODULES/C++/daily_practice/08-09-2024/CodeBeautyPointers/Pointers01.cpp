#include<iostream>
using namespace std;

// creating a pointer
// we cannot assign another datatype in other pointer :
// if int value then integer pointer

int main()
{
	int n = 5;
	int * ptr = &n;
	// printing n's value
	cout<<"n : "<<n<<endl;
	// value of integer ptr
	cout<<"ptr : "<<ptr<<endl;
	// printing value of address hold by ptr
	cout<<"*ptr : "<<*ptr<<endl;	// called as deference operator
	// assign the value 10 into the memory location who is pointed by ptr
	*ptr = 10;
	cout<<"ptr : "<<ptr<<endl;
	cout<<"*ptr : "<<*ptr<<endl;
	
	return 0;
}
