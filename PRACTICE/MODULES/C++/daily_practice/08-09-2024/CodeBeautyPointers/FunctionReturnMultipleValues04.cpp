#include<iostream>
using namespace std;
int getMin(int n[], int size) {
	int min = n[0];
	for(int i = 0; i < size; i++) {
		if(min > n[i]) {
			min = n[i];
		}
	}
	return min; 
}

int getMax(int n[], int size) {
	int max = n[0];
	for(int i = 0; i < size; i++) {
		if(max < n[i]) {
			max = n[i];
		}
	}
	return max; 
}


int main() {
	int num[] = {5,8,3,-2,1,6};
	for(int i = 0; i < 10; i++) {
		cout<<*(num+i)<<" -> ";
	}
	cout<<endl;
	cout<<"min value is : "<<getMin(num, 6)<<endl;
	cout<<"max value is : "<<getMax(num, 6)<<endl;
	return 0;
}
