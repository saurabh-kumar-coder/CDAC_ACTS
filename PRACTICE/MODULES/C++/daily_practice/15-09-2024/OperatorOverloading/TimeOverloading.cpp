#include<iostream>
using namespace std;

class Time {
	private:
		int hour;
		int min;
		int sec;
	public:
		Time(): hour(0), min(0), sec(0) {}
		
		Time(int hour, int min, int sec): hour(hour), min(min), sec(sec) {}
		
		void Accept(int hour, int min, int sec) {
			this->hour = hour;
			this->min = min;
			this->sec = sec;
		}
		
		void Display() {
			cout<<"HOUR : TIME : SECONDS "<<hour <<" : "<<min<<" : "<<sec<<endl;
		}
		
		const Time operator+(const Time t) const {
			Time temp;
			cout<<temp.hour<<" -> "<<temp.min<<" -> "<<temp.sec<<endl;
			temp.hour = hour + t.hour;
			temp.min = min + t.min;
			temp.sec = sec + t.sec;
			return temp;
		}
};

int main() {

	Time t1, t2, t3;
	t1.Accept(5,16,23);
	t2.Accept(2,1,3);
	t3 = t1 + t2;
	t3.Display();
	return 0;
}
