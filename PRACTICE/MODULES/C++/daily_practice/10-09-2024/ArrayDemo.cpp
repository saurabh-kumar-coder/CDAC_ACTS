#include<iostream>
using namespace std;

void passArray(int arr[]) {
	for(int i = 0; i < 5; i++) {
		cout<<*(arr+i)<<" -> ";	
	}
	cout<<endl;
	for(int i = 0; i < 5; i++) {
		cout<<arr[i]<<" -> ";	
	}
	cout<<endl;
}
void passArray2(int *arr) {
	for(int i = 0; i < 5; i++) {
		cout<<*(arr+i)<<" -> ";	
	}
	cout<<endl;
	for(int i = 0; i < 5; i++) {
		cout<<arr[i]<<" -> ";	
	}
	cout<<endl;
}
void passArray3(int *arr) {
	for(int i = 0; i < 5; i++) {
		cout<<*(arr+i)<<" -> ";	
	}
	cout<<endl;
	for(int i = 0; i < 5; i++) {
		cout<<arr[i]<<" -> ";	
	}
	cout<<endl;
}

int main() {
	int arr[5] = {1,2,3,6,5};
	passArray(arr);
	passArray3(arr);
	passArray2(&arr[0]);
	return 0;
}
