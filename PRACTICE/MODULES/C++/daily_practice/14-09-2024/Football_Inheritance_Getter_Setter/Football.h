#include<iostream>
#include "Player.h"
using namespace std;

class Football : public Player {
	private:
		int goals;
	public:
		Football();
		Football(int goals);
		void setGoals(int goals);
		int getGoals();
		/*
		void Accept();
		void Display();
		*/
};
