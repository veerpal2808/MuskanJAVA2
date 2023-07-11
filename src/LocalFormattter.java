import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalFormattter {
public static void main(String[] args) {
	LocalDateTime dt= LocalDateTime.now();
	System.out.println(dt);
	
  DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy --- E --a --B");
  
  String musu=dt.format(df);
  
	System.out.println(musu);

}
}
