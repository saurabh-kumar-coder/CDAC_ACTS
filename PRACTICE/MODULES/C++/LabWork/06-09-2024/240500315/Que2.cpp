#include<iostream>
using namespace std;

void sortArray(int arr[], int n)
{
    int i, j;
    bool swapped;
    for (i = 0; i < n - 1; i++) {
        swapped = false;
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
                swapped = true;
            }
        }
        if (swapped == false)
            break;
    }
}

void printArray(int arr[], int n){

	cout<<"Entered marks is:"<<endl;

	for(int i=0; i<n; i++){
	
	cout<<arr[i]<<"  ";
	}
}

int main(){

	int no;
	
	cout<<"Enter number of student:";
	cin>>no;

	int *smarks = new int[no];
	
	cout<<"Enter Marks of Students:"<<endl;
	
	for(int i=0; i<no; i++){
	
	cout<<"Enter marks of student "<<i+1<<": ";
	cin>>*(smarks+i);
	}
	
	void sortArray(smarks, no);
	
	void printArray(smarks, no);
	
	return 0;

}
