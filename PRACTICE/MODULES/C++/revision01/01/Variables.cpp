#include<iostream>
using namespace std;
int main() {
    char c = 'd';
    int i = 15;
    float f = 10.8f;
    double d = 12.89d;
    bool bo = false;

    cout<<"char : " << c << " ,sizeof : " << sizeof(c) << " \n";
    cout<<"int : " << i << " ,sizeof : " << sizeof(i) << " \n";
    cout<<"float : " << f << " ,sizeof : " << sizeof(f) << " \n";
    cout<<"double : " << d << " ,sizeof : " << sizeof(d) << " \n";
    cout<<"bool : " << bo << " ,sizeof : " << sizeof(bo) << " \n";
}
/*
char : d ,sizeof : 1 
int : 15 ,sizeof : 4 
float : 10.8 ,sizeof : 4 
double : 12.89 ,sizeof : 8 
bool : 0 ,sizeof : 1 
*/