#include<iostream>
using namespace std;

float calSimpleInterest(int p, int r, int t) {
	return (p*r*t)/100;
}

int main() {
	cout<<"Enter principal amount : ";
	int p;
	cin>>p;
	cout<<"Enter rate of interest : ";
	int r;
	cin>>r;	
	cout<<"Enter time period : ";
	int t;
	cin>>t;
	cout<<"Simple interest is : "<<calSimpleInterest(p,r,t);
	return 0;
}
