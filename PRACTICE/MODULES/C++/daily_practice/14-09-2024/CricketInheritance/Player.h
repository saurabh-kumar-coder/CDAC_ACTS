#include<iostream>
#include<string>

using namespace std;

class Player {
	private:
		int age;
		string name;
	public:
		Player();
		Player(int, string);
		void Accept();
		void Display();
};
