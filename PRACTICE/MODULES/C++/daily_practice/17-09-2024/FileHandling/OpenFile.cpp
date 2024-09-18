#include<iostream>
#include<fstream>
using namespace std;

int main() {
	ofstream fout("abc.txt", ios::out|ios::app);
	string str = "\nHello Saurabh";
	if(!fout.is_open()) {
		cout<<"file is not opened"<<endl;
	} else {
		cout<<"file successfull opened"<<endl;
	}
	fout<<str;
	fout.close(); 
	return 0;
}
