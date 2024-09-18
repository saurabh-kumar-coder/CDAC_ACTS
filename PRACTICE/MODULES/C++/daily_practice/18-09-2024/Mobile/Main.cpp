#include "Mobile.h"
#include<fstream>
using namespace std;

void showMenu() {
	cout<<"***********MENU***********"<<endl;
	cout<<"1) write into the binary file"<<endl;
	cout<<"2) read from the binary file"<<endl;
	
}

void writeIntoFile(string fileName) {
	cout<<"Writing into the file : "<<endl;
	Mobile m;
	m.Accept();
	fstream fout(fileName, ios::out | ios::binary | ios::app);
	fout.write((char*) &m, sizeof(Mobile));
	fout.close();
}

void readIntoFile(string fileName) {
	cout<<"reading data from the file : "<<endl;
	Mobile m;
	fstream fin(fileName, ios::in | ios::binary);
	while(fin.read((char*) &m, sizeof(Mobile))) {
		m.Display();
	}
	fin.close();
}

int main() {
	cout<<"reading a file"<<endl;
	char ch;
	string fileName = "text.bin";
	int choice;
	do{
		showMenu();
		cout<<"Enter your choice : "<<endl;
		cin>>choice;
		switch(choice) {
			case 1: {
					cout<<"enter file name : "<<endl;
					cin>>fileName;
					writeIntoFile(fileName);
				}
				break;
			case 2: {
					cout<<"enter file name : "<<endl;
					cin>>fileName;
					readIntoFile(fileName);
				}
				break;
			default: {
					cout<<"you entered wrong choice"<<endl;
				}
		}
		cout<<"*******want to continue**********"<<endl;
		cin>>ch;
	}while(ch == 'y' || ch == 'Y');

}
