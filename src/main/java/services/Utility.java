package main.java.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utility {
	
	public static String generateDateTime() {
		String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		return date;
	}
}
