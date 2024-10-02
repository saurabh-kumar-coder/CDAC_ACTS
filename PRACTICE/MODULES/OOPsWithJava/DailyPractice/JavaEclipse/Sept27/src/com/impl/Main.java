package com.impl;

import java.text.ParseException;
import java.util.Scanner;

import com.entity.Employee;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Details");
		Employee e1 = new Employee();
		e1.EAccept(sc);
		System.out.println(e1);
	}
}