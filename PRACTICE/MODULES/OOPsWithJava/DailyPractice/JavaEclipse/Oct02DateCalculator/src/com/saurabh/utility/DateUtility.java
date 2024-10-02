package com.saurabh.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String FORMAT1 = "dd/MM/yy";
	private static final String EMPTY = "";
	
//	date to string
	public static String getFormattedDate(Date date) {
		if(date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT1);
		return sdf.format(date);
	}
	
//	string to date
	public static Date getDate(String strDate) throws ParseException {
		if(null == strDate || EMPTY == strDate) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT1);
		Date date = sdf.parse(strDate);
		return date;
	}
	
}
