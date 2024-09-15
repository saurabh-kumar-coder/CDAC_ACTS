#include<string>
using namespace std;

class Address {
	private:
		string houseNo;
		string area;
		string pinCode;
	public:
		Address();
		Address(string houseNo, string area, string pinCode);
		void Accept();
		void Display();
};
