#include<iostream>
#include<math.h>
using namespace std;

void calRoots(int b, int a, int c, bool foo) {
	if(foo == false)
		cout<<"Positive root is : "<<(-b+sqrt((b*b)-4*a*c))/(2*a)<<endl;
	else
		cout<<"Negative root is : "<<(-b-sqrt((b*b)-4*a*c))/(2*a)<<endl;	
}

int main() {
	cout<<"enter value of B : ";
	float b;
	cin>>b;
	cout<<"enter value of A : ";
	float a;
	cin>>a;
	cout<<"enter value of C : ";
	float c;
	cin>>c;
	calRoots(b,a,c, true);
	calRoots(b,a,c, false);
	return 0;
}
