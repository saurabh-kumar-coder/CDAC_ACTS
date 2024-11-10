package com.question.ques36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertDateFormat {

	public static void convertDateFormat(String inputDate) {
		// TODO Auto-generated method stub
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		try {
			LocalDate date = LocalDate.parse(inputDate, inputFormatter);
			String outputDate = date.format(outputFormatter);
			System.out.println(inputDate + " date is converted to : " + outputDate);
		} catch (Exception e) {
			System.out.println("Invalid Date Format");
		}
	}
}
