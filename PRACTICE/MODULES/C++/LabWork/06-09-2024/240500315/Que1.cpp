#include<iostream>
#include<string>
using namespace std;

struct student{

string name;
int rollNo;
};

int index = 0;

void accept(student sarr[], int size){

	char ch;

	do{
	
	cout<<"Enter details of student "<<index+1<<" :"<<endl;
	cout<<"Enter name:";
	cin>>sarr[index].name;
	cout<<"Enter roll no:";
	cin>>sarr[index].rollNo;
	
	cout<<"Do you want to continue(Y/N): ";
	cin>>ch;
	
	index++;
	
	}while(ch != 'N');
}

void display(student sarr[], int size){


	cout<<endl<<"Enter details are:"<<endl;
	
	for(int i=0; i<index; i++){
	
	cout<<"Name: "<<sarr[i].name<<endl;
	cout<<"Roll No: "<<sarr[i].rollNo<<endl;
	}
}

int main(){


student sarr[240];

	accept(sarr,240);

	display(sarr,240);
return 0;
}
