#include<iostream>
using namespace std;
/*

*
**
***
****
*****

*/
void pattern01(int n) {
	for(int i = 0; i < n; i++) {
		for(int j = 0; j <= i; j++) {
			cout<<"*";
		}
		cout<<endl;
	}
}
/*

*****
****
***
**
*

*/
void pattern02(int n) {
	for(int i = n; i > 0 ; i--) {
		for(int j = 0; j < i; j++){
			cout<<"*";
		}
		cout<<endl;
	}
}

/*

*****
 ****
  ***
   **
    *

*/

void pattern03(int n) {
	for(int i = 0; i < n; i++) {
		for(int j = 1; j <= i; j++) {
			cout<<" ";
		}
		for(int j = 0; j < n - i; j++) {
			cout<<"*";
		}
		cout<<endl;
	}
}

/*

    *
   **
  ***
 ****
*****

*/

void pattern04(int n) {
	for(int i = 0; i < n; i++) {
		for(int j = 1; j < n - i; j++) {
			cout<<" ";
		}
		for(int j = 0; j <= i ; j++) {
			cout<<"*";
		}
		cout<<endl;
	}
}

/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

void hollowDiamond(int n) {
	for(int i = 0; i < n; i++) {
		for(int j = 0; j < n - i ; j++) {
			cout<<"*";
		}
		for(int j = 1; j <= i; j++) {
			cout<<" ";
		}
		for(int j = 1; j <= i; j++) {
			cout<<" ";
		}
		for(int j = 0; j < n - i; j++) {
			cout<<"*";
		}
		cout<<endl;
	}
	for(int i = 0; i < n; i++) {
		for(int j = 0; j <= i; j++) {
			cout<<"*";
		}
		for(int j = 1; j < n - i; j++) {
			cout<<" ";
		}
		for(int j = n - i; j > 1; j--) {
			cout<<" ";
		}
		for(int j = 0; j <= i; j++) {
			cout<<"*";
		}
		cout<<endl;
		
	}
}

/*

    *     
   ***    
  *****   
 *******  
********* 
*********
 ******* 
  *****  
   ***   
    *    


*/
void diamond(int n) {
	for(int i = 0; i < n; i++) {
		for(int j = 0; j < n - i - 1; j++) {
			cout<<" ";
		}
		for(int j = 1; j <= i + 1; j++) {
			cout<<"*";
		}
		for(int j = 1; j <= i; j++) {
			cout<<"*";
		}
		for(int j = 0; j < n - i; j++) {
			cout<<" ";
		}
		cout<<endl;
	}
	for(int i = 0; i < n; i++) {
		for(int j = 0; j < i; j++) {
			cout<<" ";
		}
		for(int j = 1; j <= n - i - 1; j++) {
			cout<<"*";
		}
		for(int j = n - i; j >= 1; j--) {
			cout<<"*";
		}
		for(int j = 0; j < i; j++) {
			cout<<" ";
		}
		cout<<endl;
		
	}
}


int main() {

	int n = 5;
//	pattern01(n);
//	pattern02(n);
//	pattern03(n);
//	pattern04(n);
//	hollowDiamond(6);
	diamond(n);
	return 0;
 
}
