package com.saurabh.characterData;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WritingIntoFile {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("myFile.txt");
				BufferedWriter br = new BufferedWriter(fw);
						){
			String str = "";
			while(true) {
				System.out.println("enter the String");
				str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				br.write(str);
				br.newLine();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
