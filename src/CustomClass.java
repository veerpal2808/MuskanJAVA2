
class Employee{
	
	int id;
	int salary;
	String name;
	
	
	
	/*public void intro(){
	
	System.out.println("Employee ids is:" + id );
    System.out.println("Employee names is:" + name );
	}
	*/
	public int getsalary() {
		return getsalary();
	}

	
}



public class CustomClass {

	public static void main(String [] args) {
		System.out.println("This is our custom class");
		
		Employee obj=new Employee();
		Employee obj1=new Employee();
		obj.id=2729;
		obj.salary=166;
		obj.name="Muskan";
		
		obj1.id=2982;
		obj1.salary=100; 
		
		obj1.name="sehaj";
		
		System.out.println("Employee ids is:" + obj.id );
	    System.out.println("Employee names is:" + obj.name );
	    System.out.println("Employee ids is:" + obj1.id );
	    System.out.println("Employee names is:" + obj1.name );
		
		//obj.intro();
		//obj1.intro();
		int salary=obj1.getsalary();
		System.out.println(salary);
			
		
		
		
		
		
			}
	
	
	
}






















