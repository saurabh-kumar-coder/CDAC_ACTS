#ifndef Point_CPP
#define Point_CPP

#include<iostream>
using namespace std;

class Point {
	private:
		int x;
		int y;
	public:
		Point() : x(0), y(0) {}
		
		Point(int x, int y) : x(x), y(y) {}
		
		Point(const Point &point) : x(point.x), y(point.y){
			cout<<"Copy const called"<<endl;
		}
		
		void Display() const {
			cout<<"Point X is : "<<x<<", "<<"Point Y is : "<<y<<endl;
		}
};

#endif
