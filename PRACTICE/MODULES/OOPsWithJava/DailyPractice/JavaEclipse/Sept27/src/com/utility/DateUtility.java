package com.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
	private static final String format = "dd/MM/yyyy";
	private static final String EMPTY = "";
	
	public static String getFormattedDate(Date date) {
		if(null == date) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	public static Date getDate(String strDate) throws ParseException {
		if (null == strDate || EMPTY.equals(strDate)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(strDate);
		return date;
	}
}
