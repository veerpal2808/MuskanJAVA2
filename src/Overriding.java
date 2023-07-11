class A{
	public void meth1() {
		System.out.println("This is the method 1 of class A");
		
	}
	public void meth2() {
		System.out.println("This is the method 2 of class A");
		
	}
	
}
class B extends A{
	
	
	public void meth2() {
		System.out.println("This is the method 2 of class B");
		
	}

	public void meth3() {
		System.out.println("This is the method 3 of class B");
		
	}
}



public class Overriding {
public static void main(String[] args) {
	
	A obj=new A();
	obj.meth1();
	

	B obj1=new B();
	obj1.meth2();
	
}
	
	
	
}
