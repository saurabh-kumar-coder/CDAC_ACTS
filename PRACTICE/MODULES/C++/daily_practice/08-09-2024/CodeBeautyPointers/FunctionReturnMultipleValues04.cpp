#include<iostream>
using namespace std;
// method to find min value
int getMin(int n[], int size) {
	int min = n[0];
	for(int i = 0; i < size; i++) {
		if(min > n[i]) {
			min = n[i];
		}
	}
	return min; 
}
// method to find max value
int getMax(int n[], int size) {
	int max = n[0];
	for(int i = 0; i < size; i++) {
		if(max < n[i]) {
			max = n[i];
		}
	}
	return max; 
}
// only one method to find min and max values.
void getMinMax(int n[], int size, int* min, int* max) {
	for(int i = 0; i < size; i++) {
		if(*min > n[i]) {
			*min = n[i];
		}
		if(*max < n[i]) {
			*max = n[i];
		}
	}
}
int main() {
	int num[] = {5,8,3,-2,1,6};
	for(int i = 0; i < 10; i++) {
		cout<<*(num+i)<<" -> ";
	}
	cout<<endl;
	cout<<"min value is : "<<getMin(num, 6)<<endl;
	cout<<"max value is : "<<getMax(num, 6)<<endl;
	int min = num[0];
	int max = num[0];
	getMinMax(num, 6, &min, &max);
	cout<<"MIN is : "<<min<<endl;
	cout<<"MAX is : "<<max<<endl;
	return 0;
}

