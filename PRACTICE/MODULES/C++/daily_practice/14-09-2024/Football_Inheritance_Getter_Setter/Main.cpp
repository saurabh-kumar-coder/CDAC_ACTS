#include "Football.h"

int main() {
	Player p1;
	p1.setAge(25);
	cout<<"Player 1 age is : "<<p1.getAge()<<endl;
	p1.setName("Parul");
	cout<<"Player 1 Name is : "<<p1.getName()<<endl;
	
	Football f1;
	f1.setAge(30);
	cout<<"Footballer 1 Age : "<<f1.getAge()<<endl;
	f1.setName("Rahul");
	cout<<"Footballer 1 Name : "<<f1.getName()<<endl;
	f1.setGoals(20);
	cout<<"Football 1 goals : "<<f1.getGoals()<<endl;

	Football f2;
	Player *p2 = &f2;
	p2->setAge(30);
	cout<<"Footballer 2 Age : "<<p2->getAge()<<endl;
	p2->setName("Rahul");
	cout<<"Footballer 2 Name : "<<p2->getName()<<endl;
//	p2->setGoals(20);
//	cout<<"Football goals : "<<p2->getGoals()<<endl;
	
	f2.setAge(30);
	cout<<"Footballer 2 Age : "<<f2.getAge()<<endl;
	f2.setName("Rahul");
	cout<<"Footballer 2 Name : "<<f2.getName()<<endl;
	f2.setGoals(20);
	cout<<"Football 2 goals : "<<f2.getGoals()<<endl;

//	not a PC relationship	
//	Player p3;
//	Football *f3 = &p3;
	
	Player p4;
	Football *f4 = (Football *)&p4;
	f4->setName("Pooja");
	cout<<"Football 4 Name : "<<f4->getName()<<endl;
	f4->setGoals(10);
	cout<<"Football 4 Goals : "<<f4->getGoals()<<endl;
	f4->setAge(25);
	cout<<"Football 4 Age : "<<f4->getAge()<<endl;
	
	return 0;
}
