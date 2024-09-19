#include "Cat.cpp"
#include "Dog.cpp"
class Pet : public Dog, public Cat {
	public:
		void sound() override {
			Dog::sound();
			Cat::sound();
		}
};
