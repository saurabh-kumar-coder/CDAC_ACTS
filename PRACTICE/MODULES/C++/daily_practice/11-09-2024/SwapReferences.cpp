#include<iostream>
using namespace std;
/*
9 3
0x7ffc8663be10 0x7ffc8663be14
after swap : 
3 9
0x7ffc8663be10 0x7ffc8663be14
**&& : 
0x7ffc8663be10 0x7ffc8663be14
a : 3 b : 9
a : 9 b : 3
swap Ref : 
a : 0x7ffc8663be10 b : 0x7ffc8663be14
a : 9 b : 3
a : 0x7ffc8663be10 b : 0x7ffc8663be14
a : 3 b : 9
*/
void swapReference(int &a, int &b) {
	int *p = &a;
	int *pp = &b;
	cout<<*p<<" "<<*pp<<endl;
	cout<<p<<" "<<pp<<endl;
	int temp = *p;
	*p = *pp;
	*pp = temp;
	cout<<"after swap : "<<endl;
	cout<<*p<<" "<<*pp<<endl;
	cout<<p<<" "<<pp<<endl;
	cout<<"**&& : "<<endl;
	cout<<&*p<<" "<<&*pp<<endl;
	cout<<"a : "<< a<<" b : "<<b<<endl;
	int tmp = a;
	a = b;
	b = tmp;
	cout<<"a : "<< a<<" b : "<<b<<endl;
}
void swapRef(int *a, int *b) {
	cout<<"swap Ref : "<<endl;
	cout<<"a : "<< a<<" b : "<<b<<endl;
	cout<<"a : "<< *a<<" b : "<<*b<<endl;
	int temp = *a;
	*a = *b;
	*b = temp;
	cout<<"a : "<< a<<" b : "<<b<<endl;
	cout<<"a : "<< *a<<" b : "<<*b<<endl;
}
int main() {
	int a = 9, b = 3;
	swapReference(a, b);
	swapRef(&a, &b);
	return 0;
}
