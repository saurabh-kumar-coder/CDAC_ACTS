#include<iostream>
#include<fstream>
using namespace std;

int main() {
	fstream file ("file.txt", ios::in | ios::out | ios::app);
	if(!file.is_open()) {
		cout<<"File not open successfully..."<<endl;
	} else {
		cout<<"File is opened succesfully..."<<endl;
		cout<<"Writing into the file : "<<endl;
		file<<"Welcome to CDAC ACTS"<<endl;
		cout<<"Reading from the file : "<<endl;
		file.seekg(0);
		string line;
		while(file.good()) {
			getline(file, line);
			cout<<line<<endl;
		}
		file.close();
	}
	return 0;
}
