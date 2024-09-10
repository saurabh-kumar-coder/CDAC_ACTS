#include<iostream>
using namespace std;

struct Student {
	private :
		int rollNo;
		string name;
	public:
		int getRollNo(){
			return rollNo;
		}
		void setRollNo(int roll) {
			rollNo = roll;
		}  
		string getName() {
			return name;
		}
		void setName(string s) {
			name = s;
		}
		
};

int main() {
	Student s;
	cout<<"enter roll no : ";
	int roll;
	cin>>roll;
	s.setRollNo(roll);
	cout<<"enter name : ";
	string name;
	cin>>name;
	s.setName(name);
	cout<<endl;
	cout<<"entered name is : "<<s.getName()<<" entered roll No is : "<< s.getRollNo();
}
