package com.saurabh.impl;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringIntoFile {
	
	public static void main(String[] args) {
		//writeStringIntoFile();
		writeIntegerIntoFile();
	}

	private static void writeIntegerIntoFile() {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter the integer: ");
			int num = sc.nextInt();
			File file = new File("Text.txt");
			PrintWriter pw = new PrintWriter(file);
			pw.print(num);
			//pw.write(num);
			pw.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void writeStringIntoFile() {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the String");
			String str = sc.nextLine();
			File file = new File("Text.txt");
			PrintWriter pw = new PrintWriter(file);
			pw.write(str);
			pw.close();
		}catch(Exception e) {
			
		}
	}
}
