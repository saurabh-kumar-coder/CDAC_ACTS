#include "Mobile.h"
#include<cstring>
Mobile::Mobile(){

}

Mobile::Mobile(char itemNo[], char modelNo[]) {
	strcpy(this->itemNo, itemNo);
	strcpy(this->modelNo, modelNo);
}

void Mobile::Accept() {
	cout<<"enter item no : "<<endl;
	cin>>itemNo;
	cout<<"enter model no : "<<endl;
	cin>>modelNo;
}

void Mobile::Display() {
	cout<<"item no is : "<<itemNo<<endl;
	cout<<"model no is : "<<modelNo<<endl;
}
