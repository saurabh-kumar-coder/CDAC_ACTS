#include<iostream>
using namespace std;
class Mobile {
	private:
		char itemNo[20];
		char modelNo[20];
	public:
		Mobile();
		Mobile(char itemNo[], char modelNo[]);
		void Accept();
		void Display();
};
