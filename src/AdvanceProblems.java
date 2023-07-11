import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/*import java.util.ArrayList;

public class AdvanceProblems {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<>();
	a1.add("Muskan");
	a1.add("Anu");
	a1.add("Pawan");
	a1.add("Harrry");
	a1.add("Arsh");
	a1.add("Aarzoo");
	
	for(String e:a1) {
		System.out.print(e);
		System.out.print(", ");

	}

	
}
}*/


public class AdvanceProblems {
public static void main(String[] args) {
	
	Date d=new Date();
	
	System.out.println(d.getSeconds()+":"+d.getMinutes()+":"+d.getHours());
	
	Calendar c1=Calendar.getInstance();
	
	System.out.println(c1.get(Calendar.SECOND)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.HOUR));

	
	LocalTime t=LocalTime.now();
	System.out.println(t.getSecond()+":"+t.getMinute()+":"+t.getHour());

}}









