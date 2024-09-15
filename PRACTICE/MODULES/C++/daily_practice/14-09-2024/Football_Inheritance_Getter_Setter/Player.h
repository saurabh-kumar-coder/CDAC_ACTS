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
		void setAge(int age);
		int getAge();
		void setName(string name);
		string getName();
		/*void Accept();
		void Display();*/
};
