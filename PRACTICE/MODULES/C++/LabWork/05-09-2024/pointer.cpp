#include<iostream>
#include<iomanip>
using namespace std;
void pointerTypeCasting() {

	int a = 10;

	int *ptr;

	ptr = &a;

	cout<<(int *)ptr<<endl;

}

void typeCasting() {
	double a = 233.34;
	int n = 10;
	double f;
	int j;
	n = a;
	cout<<"a is : "<<setprecision(5)<<a<<endl;
	f = n;
	cout<<"f is : "<<f<<endl;
	j = (int)f;
	cout<<"j is : "<<j<<endl;
	
}

int main(){

//	pointerTypeCasting();
	typeCasting();
}
