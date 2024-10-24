package day1;

public class Tester {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i * 10;
			System.out.println(arr[i]);
		}

		int newsize = 12;
		
		newArraymethod(arr,newsize);
		
		int pos = 6;
		int newSize = deleteFromPosition(arr, arr.length, pos);
		
		for (int i = 0; i < newSize; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void newArraymethod(int[] arr, int newsize) {

		int newArray[] = new int[newsize];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
			System.out.println(newArray[i]);
		}

	}

	public static int deleteFromPosition(int[] arr, int n, int pos) {
		System.out.println("running method");
//		for(int i = 0; i < pos + 1; i++) {
		int i = 0;
		while (i < n) {
			if (i == pos) {
				for (i = pos; i < n - 1; i++) {
					arr[i] = arr[i + 1];
				}
				break;
			} else if (i < pos) {
				i++;
				continue;
			}
		}
		
//		for (Integer p : arr)
//			System.out.println(p);
		return n-1;
	}
}
