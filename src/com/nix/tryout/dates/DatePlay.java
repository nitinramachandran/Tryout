package com.nix.tryout.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DatePlay {
	
	
	enum DateFormats{
		D_MMM_YYY("d MMMM yyyy"),
		YYYY_MM_DD("yyyy-MM-dd");
		
		String format;
		
		DateFormats(String format) {
			this.format = format;
		}
		
		String getFormat() {
			return this.format;
		}
	}

	/**
     * Complete the 'reformatDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
	 * @throws ParseException 
     */
    public static List<String> reformatDate(List<String> unformattedDates) {
    	
    	List<String> formattedDates = new ArrayList<String>();
    	
    	for(String unformattedDate : unformattedDates) {
    		
    		try {
        		formattedDates.add(formatDate(unformattedDate));
    		} catch (ParseException e) {
    			continue;
    		}
    	}

    	return formattedDates;
    }

    /**
     * Converts a date in the format DD MMM YYYY to YYYY-MM-DD
     * @param unformattedDate
     * @return
     * @throws ParseException
     */
    private static String formatDate(String unformattedDate) throws ParseException {
    	
    	// Removes the suffixes attached with the days 
    	String formattedDateStr = unformattedDate.replaceFirst("[a-zA-Z]{2}", "");
    	
    	SimpleDateFormat dateFormat = new SimpleDateFormat(DateFormats.D_MMM_YYY.getFormat());
    	Date date = dateFormat.parse(formattedDateStr);
    	
    	dateFormat.applyPattern(DateFormats.YYYY_MM_DD.getFormat());
    	return dateFormat.format(date);
    }


	public static void main(String[] args) throws ParseException {

		List<String> lst = Arrays.asList("4", "20th Oct 2052", "6th Jun 1933", "26th May 1960", "1st Nov 2030");
		System.out.println(DatePlay.reformatDate(lst));
	}
}