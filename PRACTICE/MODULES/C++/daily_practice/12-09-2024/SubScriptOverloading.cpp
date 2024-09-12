#include<iostream>
using namespace std;

class Array {
	private:
		int size;
		int * ptr;
	public:
		Array() :size(0) {}
		
		Array(int size) : size(size) {
			ptr = new int[size];
		}
		
		
		// subscript operator
		int & operator[] (int idx) const {
			cout<<"subscript operator running.."<<endl;
			return ptr[idx];
		}
		
		int getPtr(int idx) {
			return ptr[idx];
		}
		
		~Array() {
			cout<<"Destructor called.."<<endl;
			delete[] ptr;
		}
};

int main() {
	Array a(2);
	for(int i = 0; i < 2; i++) {
		cout<<"subscript operator called for time -> "<<i<<endl;
		a[i] = 5;
	}
	for(int i = 0; i < 2; i++)
		cout<<a.getPtr(i)<<endl;
	return 0;
}
