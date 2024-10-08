package com.saurabh.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.saurabh.pojo.Person;

public class Impl {
	public static void main(String[] args) {
		serialization();
		deserialize();
	}

	private static void deserialize() {
		Person person = null;

		try (FileInputStream fis = new FileInputStream("Data.txt");

				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			person = (Person)ois.readObject();
			
			System.out.println(person);

		} catch (IOException | ClassNotFoundException e) {

			System.err.println(e.getMessage());
		}

	}

	private static void serialization() {
		// TODO Auto-generated method stub
		Person person = new Person(2, "Rahul");
		try (FileOutputStream fos = new FileOutputStream("Data.txt");
				ObjectOutputStream dos = new ObjectOutputStream(fos)) {
			dos.writeObject(person);
			System.out.println("data saved in file");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
