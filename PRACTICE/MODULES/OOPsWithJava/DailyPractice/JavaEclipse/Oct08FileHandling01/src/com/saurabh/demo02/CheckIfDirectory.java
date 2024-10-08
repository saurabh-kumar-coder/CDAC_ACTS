package com.saurabh.demo02;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class CheckIfDirectory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckifDirectory(sc);
	}

	private static void CheckifDirectory(Scanner sc) {
		// TODO Auto-generated method stub
		File file = new File("E:\\@CDAC_ACTS\\CDAC_ACTS\\PRACTICE\\MODULES\\OOPsWithJava\\DailyPractice\\JavaEclipse");
		if (!file.exists()) {
			System.out.println("File doesn't exists");
		}
		if (file.isDirectory()) {
			System.out.println("it is a directory");
		}
//		to print the file and folders in the directory
		System.out.println("Listing files : " + Arrays.asList(file.list()));
	}
}
