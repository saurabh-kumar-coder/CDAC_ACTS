package com.cdac.acts;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * This class is to something
 */
public class Test {

	public static void main(String[] args) {
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String strDate1 = "24/04/2024";
	
		LocalDate toDate = LocalDate.parse(strDate1,dateTimeFormatter );
		System.out.println(toDate);
		System.out.println("Please enter birth date");
		String strDate2 = "24/04/1984";
		
		LocalDate fromDate = LocalDate.parse(strDate2,dateTimeFormatter );
		System.out.println(fromDate.format(dateTimeFormatter));
		Period period = Period.between(fromDate, toDate);
		System.out.println(period.getYears() + " " +period.getMonths()+ " " + period.getDays());
		

	}

}
