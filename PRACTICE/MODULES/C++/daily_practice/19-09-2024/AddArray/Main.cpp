#include "Array.h"

int main() {
	Array a1(2);
	Array a2(3);
	
	for(int i = 0; i < 2; i++) {
		a1.setArray(i, 5);
	}
	for(int i = 0; i < 2; i++) {
		cout<<a1.getArray(i)<<endl;
	}
	for(int i = 0; i < 3; i++) {
		a2.setArray(i, 6);
	}
	for(int i = 0; i < 3; i++) {
		cout<<a2.getArray(i)<<endl;
	}
	Array a3 = a1 + a2;
	for(int i = 0; i < 5; i++) {
		cout<<a3.getArray(i)<<endl;
	}
	return 0;
}
