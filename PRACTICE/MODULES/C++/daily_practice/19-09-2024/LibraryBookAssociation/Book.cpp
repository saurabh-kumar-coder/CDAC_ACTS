#ifndef Book_CPP
#define Book_CPP

#include<iostream>
using namespace std;

class Book {
	private:
		string title;
		string author;
	public:
		Book(): title(""), author("") {}

		Book(string title, string author) : title(title), author(author) {}
		
		void Display() const {
			cout<<"title : "<<title<<" -> "<<"author : "<<author<<endl;
		}
};
#endif
