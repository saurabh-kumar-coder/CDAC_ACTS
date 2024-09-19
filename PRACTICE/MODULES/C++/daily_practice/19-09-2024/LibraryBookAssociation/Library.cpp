#ifndef Lib_CPP
#define Lib_CPP

#include "Book.cpp"

class Library {
	private:
		Book* book[100];
		int bookCount;
	public:	
		Library() : bookCount(0) {}
		
		void addBook(string title, string author) {
			if(bookCount > 100) {
				cout<<"Library is full"<<endl;
			} else {
				book[bookCount] = new Book(title, author);
				bookCount++;
			}
		}
		
		void Display() const {
			cout<<"Books present in Library : "<<endl;
			for(int i = 0; i < bookCount; i++) {
				book[i]->Display();
			}
		}
};
#endif
