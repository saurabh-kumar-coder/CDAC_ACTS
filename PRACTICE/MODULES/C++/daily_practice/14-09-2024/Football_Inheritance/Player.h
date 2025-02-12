#include<iostream>
#include <string>
using namespace std;
class Player {
	private:
		int age;
		string name;
	public:
		Player();
		Player(int age, string name);
		void Accept();
		void Display();
};
