#include<iostream>
#include<fstream>
using namespace std;

void showMenu() {
	cout<<"Welcome to File Handling......."<<endl;
	cout<<"1. Write into the file."<<endl;
	cout<<"2. Read from the file."<<endl;
	cout<<"3. set seek position."<<endl;
}

int main () {
	int seekPosition = 0;
	char ch;
	string line = "";
	string fileName;
	cout<<"enter file name : ";
	cin>>fileName;
	fstream file(fileName, ios::in | ios::out | ios::app);
	do{
		showMenu();
		cout<<"Enter you choice : "<<endl;
		int choice;
		cin>>choice;
		cin.get();
		cout<<"choice : "<<choice<<endl;
		switch(choice) {
			case 1:	{
					if(!file.is_open()) {
						cout<<"file is not opened..."<<endl;
					} else {
						cout<<"file is opened"<<endl;
						cout<<"Enter the string : "<<endl;
						string data;
						getline(cin, data);
						file.clear();
						file.seekp(0, ios::end);
						file<<data<<endl;
						cout<<"Data entered...."<<endl;
					}
				}
				break;
			case 2: {
					if(!file.is_open()) {
						cout<<"file is not opened..."<<endl;
					} else {
						cout<<"file is opened..."<<endl;
						cout<<seekPosition<<endl;
						file.clear();
						file.seekg(seekPosition);
						while(file.good()) {
							getline(file, line);
							cout<<line<<endl;
						}
					}
				}
				break;
			case 3: {
					if(!file.is_open()) {
						cout<<"file is not opened..."<<endl;
					} else {
						cout<<"file is opened..."<<endl;
						cout<<"Enter SEEK POSITION..."<<endl;
						cin>>seekPosition;
						file.clear();
						file.seekg(seekPosition);
						cout<<"seek set successfully..."<<endl;
					}
				}
				break;
			default: {
					cout<<"Entered a wrong choice"<<endl;
					exit(1);
				 }
		}
		cout<<"do you want to continue(Y to yes)..."<<endl;
		cin>>ch;
	}while(ch == 'y' || ch == 'Y');
	return 0;
}
