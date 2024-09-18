#include<iostream>
#include<fstream>
using namespace std;

int main() {
	ifstream fis("abc.txt");
	string str;
	while(fis.good()) {
		getline(fis, str);
		cout<<str<<endl;
	}
	return 0;
}
