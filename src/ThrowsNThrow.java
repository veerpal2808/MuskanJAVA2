
class NegativeRadius extends Exception{
	public String toString() {
		return "radius can't be in negative";
	}
		public String getNumber() {
			return "so area also can't be in negative";

	}
}

public class ThrowsNThrow {
	public static double area(int r) throws NegativeRadius {
		if(r<0) {
			throw new NegativeRadius();
		}
		return Math.PI*r*r;
		
		
	}
	
	public static int divide (int a,int b) throws ArithmeticException {
		return a/b;
		
	}
	
	
	
	
	
public static void main(String[] args) {
	try {
		int c=divide(9,0);
		System.out.println(c);	
		}
	catch(Exception e) {
		System.out.println("We got an Exception");	
		System.out.println(e);	

	}
}
}
