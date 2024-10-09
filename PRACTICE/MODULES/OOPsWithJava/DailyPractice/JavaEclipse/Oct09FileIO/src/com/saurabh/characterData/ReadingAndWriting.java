package com.saurabh.characterData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadingAndWriting {
	public static void main(String[] args) {
		try(
				FileReader fr = new FileReader("myFile.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("myFile1.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				){
			String str = "";
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
			}
		}catch(Exception e) {
					System.out.println(e.getMessage());
				}
	}
}
