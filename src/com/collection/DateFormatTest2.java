package com.collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateFormatTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MM yyyy HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
	}

}
