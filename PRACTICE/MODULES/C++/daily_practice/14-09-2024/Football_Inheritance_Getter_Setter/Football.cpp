#include<iostream>
#include "Football.h"
using namespace std;

Football::Football(): goals(0) {}
Football::Football(int goals) : goals(goals) {}
void Football::setGoals(int goals) {
	Football::goals = goals;
}
int Football::getGoals() {
	return goals;
}
/*
void Football::Accept() {
	Player::Accept();
	cout<<"get input"<<endl;
}
void Football::Display() {
	cout<<"show output"<<endl;
}
*/
