#include "Library.cpp"
#include "Book.cpp"

int main() {
	Library library;
	library.addBook("A", "aaaaa");
	library.addBook("B", "bbbbb");
	library.addBook("C", "ccccc");
	library.Display();
	return 0;
}
