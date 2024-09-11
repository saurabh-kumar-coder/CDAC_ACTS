#include<iostream>
using namespace std;
void swap (const int &a, const int &b) {
	int temp = a;
	a = b;
	b = temp;
}

int main() {
	const int n1 = 10, n2 = 20;
	/*
	cout<<"enter numbers: ";
	cout<<"n1 : ";
	cin>>n1;
	cout<<"n2 : ";
	cin>>n2;*/ 
	swap(n1, n2);
	cout<<"n1 is : "<<n1<<" n2 is : "<<n2;
	return 0;
}

// hence not possible
