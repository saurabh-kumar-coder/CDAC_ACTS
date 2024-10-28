package com.basics.findThirdLargestInArray;

public class FindThirdLargestInArray {
	public static void main(String[] args) {
		int[] array = {1,4,6,7,8,3,5,2};
		myFindthirdHighest(array);
		findthirdHighest(array);
	}

	private static void findthirdHighest(int[] array) {
		// TODO Auto-generated method stub
		int largest = Integer.MIN_VALUE;
		int sLargest = Integer.MIN_VALUE;
		int tLargest = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > largest) {
				tLargest = sLargest;
				sLargest = largest;
				largest = array[i];
			} else if(array[i] > sLargest) {
				tLargest = sLargest;
				sLargest = array[i];
			} else if(array[i] > tLargest) {
				tLargest = array[i];
			}
		}
		System.out.println(largest);
		System.out.println(sLargest);
		System.out.println(tLargest);
	}

	private static void myFindthirdHighest(int[] array) {
		// TODO Auto-generated method stub
		int largest = array[0];
		int sLargest = Integer.MIN_VALUE;
		int tLargest = Integer.MIN_VALUE;
		for(int i = 1; i < array.length; i++) {
			if(largest < array[i]) {
				largest = array[i];
			}
			for(int j = 0; j < i; j++) {
				if(sLargest < largest) {
					if(sLargest < array[j] && array[j] != largest) {
						sLargest = array[j];
					}
				}
				for(int k = 0; k < j; k++) {
					if(tLargest < sLargest) {
						if(tLargest < array[k] && array[k] != sLargest && array[k] != largest) {
							tLargest = array[k];
						}
					}
				}
			}
		}
		System.out.println(largest);
		System.out.println(sLargest);
		System.out.println(tLargest);
	}
}
