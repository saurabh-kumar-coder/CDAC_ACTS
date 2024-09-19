#include "Mobile.h"
#include<cstring>
Mobile::Mobile(){

}

Mobile::Mobile(char itemNo[], char modelNo[], int price) {
	strcpy(this->itemNo, itemNo);
	strcpy(this->modelNo, modelNo);
	this->price = price;
}

void Mobile::Accept() {
	cout<<"enter item no : "<<endl;
	cin>>itemNo;
	cout<<"enter model no : "<<endl;
	cin>>modelNo;
	cout<<"enter price : "<<endl;
	cin>>price;
}

void Mobile::Display() {
	cout<<"item no is : "<<itemNo<<endl;
	cout<<"model no is : "<<modelNo<<endl;
	cout<<"price is : "<<price<<endl;
}

void Mobile::deserialize(ifstream& fin) {
    fin.read((char*)&itemNo, sizeof(itemNo));
    size_t modelNoLength;
    fin.read((char*)&modelNoLength, sizeof(modelNoLength));
    modelNo.resize(modelNoLength);
    fin.read(&modelNo[0], modelNoLength);
    fin.read((char*)&price, sizeof(price));
}
