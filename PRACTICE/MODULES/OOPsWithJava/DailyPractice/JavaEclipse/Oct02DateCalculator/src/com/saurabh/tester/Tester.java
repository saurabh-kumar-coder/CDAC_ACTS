package com.saurabh.tester;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Tester {
	public static void main(String[] args) {
		localDate();
		localDate2();
		ageCalc();
	}

	private static void localDate() {
		System.out.println("----- Local Date -----");
		LocalDate localDate = LocalDate.now();
		System.out.println("Todays date : " + localDate);
		LocalDate birthDate = LocalDate.of(1994, 05, 22);
		System.out.println("birth date : " + birthDate);
		Period period = Period.between(birthDate, localDate);
		System.out.println("Age is : " + period);
		System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());
	}
	public static void localDate2() {
		System.out.println("---- Local Day 2 -----");
		LocalDate today = LocalDate.now();
		System.out.println(today);
		String strDate = "24/04/1987";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDay = LocalDate.parse(strDate, dtf);
		System.out.println(birthDay);
		Period period = Period.between(birthDay, today);
		System.out.println("Age is : " + period);
		System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());
	}
	public static void ageCalc() {
		System.out.println("------ Age calc : -----");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String strDate1 = "24/04/2024";
		LocalDate toDate = LocalDate.parse(strDate1, dateTimeFormatter);
		System.out.println(toDate);
		System.out.println("Please enter date : ");
		String strDate2 = "24/04/1984";
		LocalDate fromDate = LocalDate.parse(strDate2, dateTimeFormatter);
		System.out.println(fromDate.format(dateTimeFormatter));
		Period period = Period.between(fromDate, toDate);
		System.out.println(period.getYears()+ " " + period.getMonths() + " " + period.getDays());
	}
}
