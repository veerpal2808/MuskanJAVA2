import java.util.Scanner;
class myExp extends Exception{

	public String toString() {
		return "I am toString()";
	}
		
		public String getMessage() {
			return "I am getMessage()";
		}
	}
	

public class Expections {
public static void main(String[] args) {
	System.out.println("write any number here : ");
Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
	
	if(a<10) {
	try{
		throw new ArithmeticException();
 	}
	
	catch(Exception e) {
		System.out.println("here's the exception ");
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		System.out.println(e);
       e.printStackTrace();
	}
		
	
	System.out.println("yes finished");

}
}
}