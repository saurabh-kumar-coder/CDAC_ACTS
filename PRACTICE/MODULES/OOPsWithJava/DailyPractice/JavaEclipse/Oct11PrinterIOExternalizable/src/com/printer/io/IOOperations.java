package com.printer.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.printer.pojos.Printer;

public class IOOperations {
	public static void writeIntoFile(Map<String, Printer> mapData) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Hello.ser"))){
				oos.writeObject(mapData);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static Map<String, Printer> readFromTheFile() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Hello.ser"))){
			return (Map<String, Printer>) ois.readObject();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
