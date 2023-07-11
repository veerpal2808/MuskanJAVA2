public class NestedTry {
public static void main(String[] args) {
	int[] marks= {56,92,31,78,9};
	
	try {
		System.out.println("WELCOME");
		try {
			System.out.println(marks[3]);
			

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("oops! Throws an exception as this index doesn't exists");

		}
	}
	catch(Exception e) {
		System.out.println("BYE-BYE");
		System.out.println(e);

	}
}
}
