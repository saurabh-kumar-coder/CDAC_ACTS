#include<iostream>
using namespace std;

void reverseStr(char arr[], int start, int end) {
	
	if(start >= end) {
		return ;
	}
	char temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;
	return reverseStr(arr, start+1, end-1);
}
char* myReverse(char arr[], int size) {
	if(size <= 0){
		return arr;
	}
	size--;
	//cout<<arr[size];
	myReverse(arr, size);
	//arr[size] = arr[size];
	return arr;
}


string stringRev(string str, int len) {
	if(len <= 0) {
		return str;
	}
	return str + stringRev(str, len--);
}
int main() {
	string str = "Saurabh";
	int len = str.length() - 1;
	stringRev(str, len);
	return 0;
}
