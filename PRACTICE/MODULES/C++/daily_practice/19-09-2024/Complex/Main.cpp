#include "Complex.h"

int main() {
	Complex c1, c2, c3;
	c1.Accept(2, 4);
	c2.Accept(3, 5);
	c3 = c1.add(c2);
	c3.Display();
	c1.Accept(3, 5);
	c2.Accept(4, 6);
	c3 = c1 + c2;
	c3.Display();
	return 0;
}
