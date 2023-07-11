
import java.util.Scanner;
public class TryCatchEx {
public static void main(String[] args) throws ArithmeticException {
	int [] marks= {56,68,96};
	System.out.println("write the index of the number that you want to print");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("write the number you want to divide index number with");

	int num=sc.nextInt();
	
	try {	System.out.println("the value of eneterd index is: " +marks[a]);
	System.out.println("number after division is: " + marks[a]/num);

		
	}catch(Exception e) {
		System.out.println("Try again");
		System.out.println(e);

	}
	

	}
}

