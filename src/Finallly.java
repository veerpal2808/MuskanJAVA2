
public class Finallly {
public  static int greet() {
	try {
		int a=20;
		int b=0;
		int c=a/b;
		return c;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally{
		System.out.println("Muskan is a good girl");

	}
	return 0;
}
public static void main(String[] args) {
	int k=greet();
	System.out.println(k);

}
}
