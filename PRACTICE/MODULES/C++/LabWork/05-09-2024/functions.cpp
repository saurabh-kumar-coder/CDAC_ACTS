#include<iostream>
using namespace std;

void fun1(int a){

	a=100;
}

void fun2(int &a){

	a = 100;
}

void fun3(int *a){                                     

	*a = 100;
}

void callByValueSwap(int a, int b) {
	cout<<"before swap ----> a is : "<< a <<" b is : "<<b<<endl;
	a = a + b;
	b = a - b;
	a = a - b;
	
	cout<<"after swap ----> a is : "<< a <<" b is : "<<b<<endl;

}

void callByReferenceSwap(int &a, int &b) {
	cout<<"before swap ----> a is : "<< a <<" b is : "<<b<<endl;
	a = a + b;
	b = a - b;
	a = a - b;
	cout<<"after swap ----> a is : "<< a <<" b is : "<<b<<endl;
}

void callByPointerSwap(int *a, int *b) {
	cout<<"before swap ----> a is : "<< *a <<" b is : "<<*b<<endl;
	*a = *a + *b;
	*b = *a - *b;
	*a = *a - *b;
	cout<<"after swap ----> a is : "<< *a <<" b is : "<<*b<<endl;
}

int main(){

	int a=10,b=12,c=10;

	cout<<"A = "<<a<<endl;
	cout<<"B = "<<b<<endl;
	cout<<"C = "<<c<<endl;
/*
	fun1(a);
	fun2(b);
	fun3(&c);
*/	
	//callByValueSwap(a, b);
	//callByReferenceSwap(a,b);
	callByPointerSwap(&a, &b);

	cout<<"A = "<<a<<endl;
	cout<<"B = "<<b<<endl;
	cout<<"C = "<<c<<endl;

	return 0;
}
