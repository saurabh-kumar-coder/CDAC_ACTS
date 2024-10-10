package com.saurabh.impl;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

import com.saurabh.data.PersonData;
import com.saurabh.pojo.Person;

public class Impl {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);
				FileOutputStream fos = new FileOutputStream("abc.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream("abc.bin");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			List<Person> personList = PersonData.getPersonData();
			serializePersonObject(personList, oos);
//			deserializePersonObject(ois);
			findPersonById(ois);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void findPersonById(ObjectInputStream ois) {
		// TODO Auto-generated method stub
		try {
			while (true) {
				Person person = (Person) ois.readObject();

				if (person.getId() == 10) {
					System.out.println("person found by id = 10 : " + person);
					return;
				}
			}
		} catch (EOFException e) {
			// End of file reached, which is normal in this context
			System.out.println("End of stream reached.");
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("I/O error: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Unexpected error: " + e.getMessage());
		}
	}

	private static void deserializePersonObject(ObjectInputStream ois) {
		// TODO Auto-generated method stub
		Person person = null;
		try {
			while (true) {
				person = (Person) ois.readObject();
//				System.out.println(person);
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
//					System.out.println(e.getMessage());
		}
	}

	private static void serializePersonObject(List<Person> personList, ObjectOutputStream oos) {
		// TODO Auto-generated method stub
		try {
			for (Person person : personList) {
				oos.writeObject(person);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
