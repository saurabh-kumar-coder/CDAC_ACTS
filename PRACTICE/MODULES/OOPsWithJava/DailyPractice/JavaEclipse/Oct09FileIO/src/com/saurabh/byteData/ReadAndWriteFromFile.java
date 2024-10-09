package com.saurabh.byteData;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteFromFile {
	public static void main(String[] args) {
		try(
				FileInputStream fis = new FileInputStream("byte.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("byte1.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			int str = 0;
			while((str = bis.read()) != -1) {
				bos.write((char)str);
			}
		}catch(Exception e) {System.out.println(e.getMessage());}
	}
}
