#include<iostream>
using namespace std;

// void pointer is a pointer which can hold address of any different type of datatype's

void printNumber(int* n) {
	cout<<*n<<endl;
}

void printCharacter(char* c) {
	cout<<*c<<endl;
}

void voidPointer(void* ptr, char type) {
	switch(type) {
		case 'i':
			cout<<*(int*)ptr<<endl;
			break;
		case 'c':
			cout<<*(char*)ptr<<endl;
			break;
		default:
			cout<<"bye..";
	}
}

int main() {
	int num = 10;
	char ch = 'a';
	printNumber(&num);
	printCharacter(&ch);	
	voidPointer(&num, 'i');
	voidPointer(&ch, 'c');
	return 0;
}
