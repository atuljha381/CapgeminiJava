package com.collection;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateFormatTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.MONTH) + 1 + "/" + cal.get(Calendar.DATE) + "/" + cal.get(Calendar.YEAR));

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALIAN);
		System.out.println(df1.format(cal.getTime()));

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALIAN);
		System.out.println(df2.format(cal.getTime()));

		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ITALIAN);
		System.out.println(df3.format(cal.getTime()));

		DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALIAN);
		System.out.println(df4.format(cal.getTime()));
	}
}
