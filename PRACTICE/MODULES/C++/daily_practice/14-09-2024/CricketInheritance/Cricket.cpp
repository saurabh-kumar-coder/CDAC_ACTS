#include<iostream>
#include "Cricket.h"

Cricket::Cricket() : runs(0) {}
Cricket::Cricket(int runs) : runs(runs) {}
void Cricket::Accept() {
	cout<<"Cricket Accept"<<endl;
}
void Cricket::Display() {
	cout<<"Cricket Display"<<endl;
}
