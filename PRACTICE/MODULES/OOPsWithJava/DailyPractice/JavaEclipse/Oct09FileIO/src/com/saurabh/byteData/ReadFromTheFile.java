package com.saurabh.byteData;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadFromTheFile {
	public static void main(String[] args) {
		try(
			FileInputStream fis = new FileInputStream("byte.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
				){
			int str = 0;
			while((str = bis.read()) != -1) {
				System.out.print((char)str);
			}
		}catch(Exception e) {System.out.println(e.getMessage());}
	}
}
