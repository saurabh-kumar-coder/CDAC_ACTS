package com.saurabh.byteData;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteIntoFile {
	public static void main(String[] args) {
		try(
			Scanner sc = new Scanner(System.in);
			FileOutputStream fis = new FileOutputStream("byte.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fis);
				){
			String str = "";
			while(true) {
				System.out.println("Enter the String");
				str = sc.nextLine();
				if(str.equals("quit")) {
					break;
				}
				bos.write((str+"\n").getBytes());
			}
		}catch(Exception e) {System.err.println(e.getMessage());}
	}
}
