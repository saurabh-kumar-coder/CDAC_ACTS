/*
Write menu driven java program for performing Add, Subtract, Multiplication and division of numbers. 
*/
import java.util.Scanner;
class Calculator {
	public static int addition(int a, int b) {
		return a+b;
	}
	public static int subtraction(int a, int b) {
		return a-b;
	}
	public static int multiplication(int a, int b) {
		return a*b;
	}
	public static int division(int a, int b) {
		return a/b;
	}
	public static void main(String args[]) {
		char ch = 0;
		int value = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter your choice... 1 Addition, 2 Subtraction, 3 Multiplication, 4 Division");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: {
					value = addition(4, 5);
					System.out.println(value);
				}
				break;
				case 2: {
					value = subtraction(4, 5);
					System.out.println(value);
				}
				break;
				case 3: {
					value = multiplication(4, 5);
					System.out.println(value);
				}
				break;
				case 4: {
					value = division(4, 5);
					System.out.println(value);
				}
				break;
				default: {
					System.out.println("You entered wrong choice..");
				}
			}
			System.out.println("Do you want to continue..");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}