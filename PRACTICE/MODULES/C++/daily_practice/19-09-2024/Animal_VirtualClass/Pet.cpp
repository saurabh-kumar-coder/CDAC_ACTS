#ifndef PET_CPP
#define PET_CPP

#include "Cat.cpp"
#include "Dog.cpp"
class Pet : public Dog, public Cat {
	public:
		void sound() override {
			cout<<"pets : "<<endl;
			Cat::sound();
			Dog::sound();
		}
};
#endif
