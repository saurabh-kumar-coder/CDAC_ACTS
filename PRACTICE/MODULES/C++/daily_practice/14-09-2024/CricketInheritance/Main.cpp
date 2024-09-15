#include<iostream>
#include "Cricket.h"
using namespace std;

int main() {
/*
//	case1	
	Player p;
	p.Accept();
	p.Display();
	
	Cricket c;
	c.Accept();
	c.Display();
*/
/*
//	case2
	Player *cp;
	Player p;
	cp = &p;
	Player *cp1 = &p;
	cp->Accept();
	cp->Display();
*/

/*	
//	case3
	Player *pp = NULL;
	Cricket c;
	pp = &c;
	pp->Accept();
	pp->Display();
*/

/*
//	case4
	Player p;
	Cricket *cp = &p;		//error: invalid conversion from ‘Player*’ to ‘Cricket*’
	cp->Accept();
	cp->Display();
*/

/*
//	case5
	Player p;
	Cricket *cp = (Cricket *)&p;
	cp->Accept();
	cp->Display(); 
*/

	return 0;	
}
