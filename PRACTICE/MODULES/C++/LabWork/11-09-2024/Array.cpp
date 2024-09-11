#include<iostream>
using namespace std;
class Array {

	int *ptr;
	int size;
	
	public:
	
		Array(int size):size(size){
			ptr = new int[size];
		}
		
		void Accept() {
			cout<<"Enter array elements:"<<endl;
			for(int i=0; i<size; i++){
				cout<<"Enter array element "<<i+1<<" :";
				cin>>ptr[i];
			}
		}
		
		void Display(){
			cout<<"Entered array elements are: ";
				for(int i=0; i<size; i++){
				cout<<ptr[i]<<" "<<endl;
			}		
		}
		
		~Array(){
			cout<<"Destructor called"<<endl;
			delete[] ptr;
		}	
};

int main(){

	int size;

	cout<<"Enter number of array elements:";
	cin>>size;
	
	Array obj(size);
	
	obj.Accept();
	
	obj.Display();
	
	return 0;
}
