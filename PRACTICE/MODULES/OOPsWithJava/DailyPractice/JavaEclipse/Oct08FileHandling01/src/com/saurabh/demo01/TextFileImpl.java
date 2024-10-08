package com.saurabh.demo01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TextFileImpl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		writingInTextFile(sc);
		readingFromTextFile();
	}

	private static String readingFromTextFile() {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			if(!file.exists()) {
				return "file doesn't exists";
			}
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			return "data printed successfully";
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return "bye";
		}
	}

	private static String writingInTextFile(Scanner sc) {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
//		"true" is to append the next coming data
		try(FileWriter fw = new FileWriter(file, true);){
			if(!file.exists()) {
				return "file not found";
			}
			String data = "";
			while(!data.equals("exit")) {
				System.out.println("Enter the String");
				data = sc.nextLine();
				if(data.equals("exit")) {
					break;
				}
				fw.write(data + "\n");
			}
			return "data updated";
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return "exception handled";
		}
	}
}
