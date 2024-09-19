#include<iostream>
using namespace std;
class Array {
	private: 
		int size;
		int *ptr;
	public:
		Array();
		Array(int);
		void Accept();
		void Display();
		void setArray(int, int);
		int getArray(int);
		int & operator[](int idx);
		Array operator+(Array);
		~Array();
};
