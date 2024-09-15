#include<iostream>
#include "Player.h"
using namespace std;

Player::Player() : age(0), name("") {}
Player::Player(int age, string name) : age(age), name(name) {}
void Player::Accept() {
	cout<<"Player Accept : "<<endl;
}
void Player::Display() {
	cout<<"Player Display : "<<endl;
}
