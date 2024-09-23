/*
Write a function for factorial and use the function for printing factorial series like 1 2 6 24 120
*/

public class Factorial {
	public static int fact(int val) {
		if(val == 0 || val == 1) {
			return 1;
		}
		return val * fact(val -1);
	}
	public static void main(String[] args) {
		int value = Factorial.fact(5);
		System.out.println(value);
	}
}