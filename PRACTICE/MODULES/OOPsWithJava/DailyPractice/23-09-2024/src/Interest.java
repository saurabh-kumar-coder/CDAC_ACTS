/*
Write menu driven java program with below options

Calculate simple interest
Calculate compound interest

*/
import java.util.Scanner;
class Interest {
	public static void simpleInterest(int p, int r, int t) {
		int si = (p * r * t) / 100;
		System.out.println("SI is : " + si);
	}
	public static void compoundInterest(int principal, int rate, int time) {
		double ci = principal * (Math.pow((1 + rate / 100), time));
		System.out.println("CI is : " + ci);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice.. 1 Simple Interest, 2 Compound Interest");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: {
				simpleInterest(1000, 10, 2);
			}
			break;
			case 2: {
				compoundInterest(1000, 10, 2);
			}
			break;
			default : {
				System.out.println("wrong choice");
			}
		}
	}
}