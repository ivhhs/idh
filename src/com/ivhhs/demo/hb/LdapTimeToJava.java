package com.ivhhs.demo.hb;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LdapTimeToJava {

	private static long BASE_TIME_C = 130833017979796725L;
	private static String BASE_TIME_J = "2015-08-06 10:29:57";
	private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static Date convert(String ltime) {
		Date target = null;
		try {
			Date base_time_j = DATE_FORMAT.parse(BASE_TIME_J);
			long j_base = base_time_j.getTime();

			long c_target = Long.parseLong(ltime);
			long j_diff = (c_target - BASE_TIME_C) / 10000;

			long j_total = j_base + j_diff;
			target = new Date(j_total);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return target;
	}

	public static void main(String[] args) {

		System.out.println(DATE_FORMAT.format(convert("130760523717856590")));
	}
}
