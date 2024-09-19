#include<iostream>
#include<fstream>
using namespace std;

int main(int args, const char* argv[]) {
	
	if(argc != 3) {
		cout<<"input not correct"<<endl;
		return -1;
	}	
	ifstream fin(argv[1], ios::in);
	ofstream fout(argv[2], ios::out);
	
	if(!fout || !fin) {
		cout<<"file not opened";
		return -1;
	}
	
	char ch;
	while(fin.get(ch)){
		fout.put(ch);
	}
	fin.close();
	fout.close();
	return 0;
}
