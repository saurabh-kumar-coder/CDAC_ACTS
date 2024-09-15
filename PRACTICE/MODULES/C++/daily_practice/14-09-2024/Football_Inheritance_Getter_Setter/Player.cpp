#include <string>
#include "Player.h"
//using namespace std;

Player::Player() : age(0), name("") {}
Player::Player(int age, string name) : age(age), name(name) {}
void Player::setAge(int age) {
	Player::age = age;
}
int Player::getAge() {
	return age;
}
void Player::setName(string name) {
	Player::name = name;
}
string Player::getName() {
	return name;
}
/*
void Player::Player::Accept() {
	cout<<"Player accept called "<<endl;
}
void Player::Player::Display() {
	cout<<"Player display called"<<endl;
}
*/
