package com.saurabh.demo03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyFile {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			File file = new File("text.txt");
			String getData = readingDatafromOneFile(sc, file);
			writeDataToAnotherFile(getData, new File("Copy.txt"));
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
			while((line = br.readLine()) != null) {
				data = data.append(line).append("\n");
			}
			return data.toString();
		}catch(Exception e) {
			return "Exception occured";
		}
	}
}
