#include "Pet.cpp"
int main() {
	Animal *a = NULL;
	Cat c;
	Dog d;
	a = &c;
	a->sound();
	a = &d;
	a->sound();
	
	
	Pet p;
	p.sound();
	return 0;
}
