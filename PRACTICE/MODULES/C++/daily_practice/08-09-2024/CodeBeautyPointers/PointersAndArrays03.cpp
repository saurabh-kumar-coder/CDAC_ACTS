#include<iostream>
using namespace std;

int main() {
	int luckyNumbers[] = {1,2,3,4,5};
	cout<<"first address of luckyNumbers : "<<luckyNumbers<<endl;
	cout<<"address of first index of luckyNumbers : "<<&luckyNumbers[0]<<endl;
	cout<<"first element of luckyNumbers : "<<luckyNumbers[0]<<endl;
	cout<<"first element of luckyNumbers using pointers : "<<*(luckyNumbers+0)<<endl;
	cout<<"second element of luckyNumbers using pointers : "<<*(luckyNumbers+1)<<endl;
}
