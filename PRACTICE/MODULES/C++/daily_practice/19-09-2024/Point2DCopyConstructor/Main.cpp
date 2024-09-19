#include "Point.cpp"

int main() {
	Point p1(2,5);
	Point p2 = p1;
	p1.Display();
	p2.Display();
	cout<<"P1 : "<<&p1<<endl;
	cout<<"P2 : "<<&p2<<endl;
	return 0;
}
