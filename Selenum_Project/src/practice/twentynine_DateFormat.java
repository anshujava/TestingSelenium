package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		    Date date = new Date();
	        // Specify the desired date format
	        String DATE_FORMAT = "dd-MMM-yyyy_HH:mm:ss";
	        // Create object of SimpleDateFormat and pass the desired date format.
	        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	        /*
	         * Use format method of SimpleDateFormat class to format the date.
	         */
	        System.out.println("Today is " + sdf.format(date));

	}

}
