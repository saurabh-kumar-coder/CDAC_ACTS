#include<iostream>
using namespace std;
// not possible
void swapConstRef(const int &a, const int &b) {
	int temp = a;
	a = b;
	b = temp;
	
}

int main() {
	int a = 9, b = 5;
	swapConstRef(a, b);
}
