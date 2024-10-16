import java.util.Scanner;
public class IntegerSum {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number 1 : ");
			int a = sc.nextInt();
			System.out.println("Enter number 2 : ");
			int b = sc.nextInt();
			int c = a + b;
			System.out.println("Sum to two number is : " + c);
		}
	}
}
