#include<iostream>
#include "Player.h"
using namespace std;

class Cricket : public Player {
	private:
	int runs;
	public:
	Cricket();
	Cricket(int runs);
	void Accept();
	void Display();
};
