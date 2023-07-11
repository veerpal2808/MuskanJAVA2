class A1{
	public void meth1() {
		System.out.println("This is the method 1 of class A");
		
	}
	public void meth2() {
		System.out.println("This is the method 2 of class A");
		
	}
	
}
class B1 extends A1{
	
	
	public void meth2() {
		System.out.println("This is the method 2 of class B");
		
	}

	public void meth3() {
		System.out.println("This is the method 3 of class B");
		
	}
}



public class DMD {
public static void main(String[] args) {
	
	//A1 obj=new A1();
	//obj.meth1();
	

	//B1 obj1=new B1();
	//obj1.meth2();
	A1 obj=new B1();
	
	obj.meth2();
//	obj.meth3(); NOT ALLOWED
}
	
	
	
}

//OBJECT IS MADE ON RUNTIME
