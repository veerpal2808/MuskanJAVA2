
import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.TimeZone;
public class CalendarClass {
public static void main(String[] args) {
	
	//Calendar c1=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
	
//	System.out.println(c1.getCalendarType());
	//System.out.println(c1.getTimeZone());

	Calendar c=Calendar.getInstance();
	System.out.println(c.get(Calendar.DATE));
	//System.out.println(c.get(Calendar.DAY_OF_MONTH));
	System.out.println(c.get(Calendar.DAY_OF_WEEK));
	System.out.println(c.get(Calendar.DAY_OF_YEAR));
	System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));


	GregorianCalendar g1=new GregorianCalendar();
	System.out.println(g1.isLeapYear(5044));

	}
}
