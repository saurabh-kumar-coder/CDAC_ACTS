/*
Write a java program to sort an array of 10 numbers. Get array element from user and use any sorting method you like.
*/
import java.util.Scanner;
public class ArraySort {
	public static int[] arrSort(int[] arr) {
		System.out.println("Hello");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String [] args) {
		System.out.println("enter an array");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int narr[] = arrSort(arr);
		for(int i = 0; i < narr.length; i++) {
			System.out.println(narr[i]);
		}
	}
}