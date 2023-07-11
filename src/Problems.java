/* 
class employee{
	int salary;
	String name;
	

public int getSalary() {
	return salary;}
	
	public String getName() {
		return name;
	}
	
public void setName(String n) {
	name=n;
}

}

public class Problems {
public static void main(String[] args) {
	employee obj=new employee();
	obj.salary=11;
	obj.setName("sehaj");
	System.out.println(obj.getSalary());
	System.out.println(obj.getName());
	
	
	
}
}

class cellphone{
	public void ringing() {
		System.out.println("ringing...");
		
	}
	public void vibrating() {
		System.out.println("vibrating...");
	}
	
	public void shaking() {
		System.out.println("shaking...");
	}
}





public class Problems{
	public static void main(String[] args ) {
		cellphone obj=new cellphone();
		obj.ringing();
		obj.vibrating();
		obj.shaking();
		
		
	}
	
}





class square{
	int a;
	public int area() {
		return a*a;
		
	}
	public int peri() {
		return 4*a;
	}
	
	
}






public class Problems{
	public static void main(String[] args ) {
		square obj=new square();
		obj.a=8;
		System.out.println(obj.area());
		
		System.out.println(obj.peri());
		
	}
	
}

*/



class rect{
	int a;
	int b;
	public int area() {
		return a*b;
		
	}
	public int peri() {
		return 4*(a+b);
	}
	
	
}






public class Problems{
	public static void main(String[] args ) {
		rect obj=new rect();
		obj.a=8;
		obj.b=5;
		System.out.println(obj.area());
		
		System.out.println(obj.peri());
		
	}
	
}






























































