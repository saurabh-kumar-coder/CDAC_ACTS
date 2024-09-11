#include<iostream>
using namespace std;
void demo01() {
	int n;
	cin>>n;
	string st;
	cin>>st;
	cout<<"n : "<<n<<" st : "<<st<<endl;	
}
void demo02() {
	int n;
	cin>>n;
	string st;
	getline(cin, st);
	cout<<"n : "<<n<<" st : "<<st<<endl;
}
void demo03() {
	int n;
	cin>>n;
	cin.get();
	string st;
	getline(cin, st);
	cout<<"n : "<<n<<" st : "<<st<<endl;
}
int main() {
//	demo01();
//	demo02();
	demo03();
	return 0;
}
