package CoreJavaTraining.dateNCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.APRIL));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MILLISECOND));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println(cal.getWeekYear());
		
		
		
		
	}

}
