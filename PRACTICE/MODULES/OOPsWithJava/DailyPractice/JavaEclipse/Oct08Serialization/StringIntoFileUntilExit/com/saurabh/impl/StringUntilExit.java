package com.saurabh.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringUntilExit {
	public static void main(String[] args) {
		//writeDataIntoFile();
		readDataFromFile();
	}

	private static void readDataFromFile() {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("poor.txt"))) {
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);			
			}
		} catch(Exception e) {}
	}

	private static void writeDataIntoFile() {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("poor.txt", false);
				PrintWriter pw = new PrintWriter(fw);
				) {
			String str = "";
			while(!str.equals("exit")) {
				System.out.println("enter the String");
				str = sc.nextLine();
				pw.println(str);
			}
			System.out.println("out now");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
