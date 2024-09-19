#include<iostream>
using namespace std;
class Mobile {
	private:
	public:
		char itemNo[20];
		char modelNo[20];
		int price;
		Mobile();
		Mobile(char itemNo[], char modelNo[], int price);
		void Accept();
		void Display();
		void deserialize(ifstream& in);
};
