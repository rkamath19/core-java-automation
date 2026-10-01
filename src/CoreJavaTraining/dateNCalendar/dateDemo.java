package CoreJavaTraining.dateNCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo
{

	public static void main(String[] args)
	{
		
		Date d = new Date();
		
		System.out.println(d);
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf2.format(d));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("M/dd/yyyy HH:mm:ss:SSS E D F w W a k K z");
		System.out.println(sdf3.format(d));
	}

}
