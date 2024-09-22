import java.util.Scanner;

public class AdditionOperationScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("enter number 2 : ");
		int num2 = sc.nextInt();
		System.out.println("Sum of 2 numbers is : ");
		int num3 = num1 + num2;
		System.out.println(num3);
		sc.close();
	}
}