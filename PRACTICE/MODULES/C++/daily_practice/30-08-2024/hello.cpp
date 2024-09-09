#include <iostream>
// #include <stdio>
using namespace std;
int main()
{
    cout << "Enter Your Name : ";
    string n;
    cin >> n;
    cout << "Hello `" << n << "`";
    // cin.get();

    // ------ WIDE CHARACTER IN C++ -----------------

    wchar_t x = L'P';
    wcout << x;
    cout << "enter wide character x : ";
    wcin >> x;
    wcout << "\n X is : " << x;
    cout << "size of wide variable : " << sizeof(x);
    wchar_t xx = L'L';
    cout << "\nsize of xx : " << sizeof(xx);
    // ----------------------------------------------

    return 0;
}