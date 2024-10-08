package com.saurabh.demo04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyFileWithCounters {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			File file = new File("text.txt");
			String getData = readingDatafromOneFile(sc, file);
			writeDataToAnotherFile(getData, new File("Copy.txt"));
			System.out.println("data copied into file");
		}
	}

	private static void writeDataToAnotherFile(String data, File file) {
		// TODO Auto-generated method stub
		try(FileWriter fw = new FileWriter(file)){
			fw.write(data);
			System.out.println("Data written into file");
		} catch(Exception e) {
			System.out.println("Exception found");
		}
	}

	private static String readingDatafromOneFile(Scanner sc, File file) {
		// TODO Auto-generated method stub
		if(!file.exists()) {
			return "File not found";
		}
		try(
		BufferedReader br = new BufferedReader(new FileReader(file));){
			StringBuilder data = new StringBuilder();
			String line = "";
			int wordCounter = 0;
			int lineCounter = 0;
			int charCounter = 0;
			while((line = br.readLine()) != null) {
				lineCounter +=1;
				wordCounter += line.split("\\s+").length;
				charCounter += line.length();
				data = data.append(line).append("\n");
			}
			System.out.println("Words are : " + wordCounter);
			System.out.println("lines are : " + lineCounter);
			System.out.println("character's are : " + charCounter);
			return data.toString();
		}catch(Exception e) {
			return "Exception occured";
		}
	}
}
