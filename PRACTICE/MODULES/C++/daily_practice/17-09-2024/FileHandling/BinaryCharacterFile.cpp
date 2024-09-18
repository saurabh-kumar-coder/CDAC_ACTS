#include<iostream>
#include<cstring>
#include<fstream>
using namespace std;

int main() {
	char input[100];
	strcpy(input, "hello I am Saurabh Kumar");
	fstream file("binary.bin", ios::binary | ios::in | ios::out | ios::trunc);
	if(!file.is_open()) {
		cout<<"File is not opening";
	} else {
		cout<<"File is opened"<<endl;
		cout<<"writing into the file : "<<endl;
		int length = strlen(input);
		for(int i = 0; i < length; i++) {
			file.put(input[i]);
		}
		file.flush();
		file.seekg(0);
		char ch;
		while(file.get(ch)) {
			cout<<ch;
		}
		file.close();
	}
	return 0;
}
