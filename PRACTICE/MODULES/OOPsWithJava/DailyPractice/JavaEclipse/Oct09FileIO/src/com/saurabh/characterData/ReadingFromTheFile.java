package com.saurabh.characterData;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingFromTheFile {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("myFile.txt");
				BufferedReader br = new BufferedReader(fr);){
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
