package com.cmc.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static final String PATRON = "yyyy/dd/MM";
	public static Date convertir(String date) throws ParseException{
		SimpleDateFormat simpleDate = new SimpleDateFormat(PATRON);
		
		Date fecha = simpleDate.parse(date);
		return fecha;
	}
}
