package com.layer.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HandleDate {
	private static Calendar cal = null;

	public static String getDate(int d, int m, int y) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		cal = Calendar.getInstance();
		cal.set(y, m - 1, d);
		return sdf.format(cal.getTime());
	}

}
