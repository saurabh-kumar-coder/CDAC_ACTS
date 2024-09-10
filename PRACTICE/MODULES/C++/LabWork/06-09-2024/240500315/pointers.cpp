#include<iostream>
using namespace std;

void pointerDemo() {

	int a = 100;
	int * p;
	cout<<"p : "<<p<<endl;
	cout<<"*p : "<<*p<<endl;
	p = &a;
	cout<<"p : "<<p<<endl;
	cout<<"*p : "<<*p<<endl;
	
}

void void_pointer(){

	int a = 10;
	char ch = 'A';

	void *vptr = &a;

	cout<<"a = "<<*(int *)vptr<<endl;

	vptr = & ch;

	cout<<"ch = "<<*(char *)vptr<<endl;
}

int main() {

	//pointerDemo();
	
	void_pointer();
	
}
