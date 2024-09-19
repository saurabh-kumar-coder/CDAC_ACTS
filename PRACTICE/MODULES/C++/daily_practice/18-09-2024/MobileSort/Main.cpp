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
	ofstream fout(fileName, ios::out | ios::binary | ios::app);
	fout.write((char*) &m, sizeof(Mobile));
	fout.close();
}

void readIntoFile(string fileName, Mobile mobile[]) {
	cout<<"reading data from the file : "<<endl;
	ifstream fin(fileName, ios::in | ios::binary);
	int ctr = 0;
	int maxSize = 5;
	while (ctr < maxSize) {	
		Mobile m;
		
		//m.deserialize(fin);
		fin.read((char*)&m.itemNo, sizeof(m.itemNo));
		size_t modelNoLength;
		fin.read((char*)&modelNoLength, sizeof(modelNoLength));
		m.modelNo.resize(modelNoLength);
		fin.read(&m.modelNo[0], modelNoLength);
		fin.read((char*)&m.price, sizeof(m.price));
		
		if (fin.eof()) 
			break;
		mobile[ctr] = m;
		cout << "mobile[" << ctr << "]: ";
		mobile[ctr].Display();
		ctr++;
    	}
	fin.close();
}

	/*while(fin.read((char*) &m, sizeof(Mobile))) {
		mobile[ctr] = m;
		cout<<"mobile[ctr].itemNo : "<<mobile[ctr]<<endl;
		ctr++;
		m.Display();
	}*/

int main() {
	cout<<"reading a file"<<endl;
	char ch;
	string fileName = "text.bin";
	Mobile mobile[5];
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
					readIntoFile(fileName, mobile);
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
