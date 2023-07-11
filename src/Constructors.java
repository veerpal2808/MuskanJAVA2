
class muskan{
	int id;
	String name;
	public muskan(String myname, int myid) {
		id=myid;
		name=myname;
		
		
	}
 	public int getId() {
		return id;
	}
	public String getname() {
		
		return name;
	}
	
	
}



public class Constructors {
public static void main(String[] args) {
	
	
	muskan obj=new muskan("virpal6",27898);
	System.out.println(obj.getname());
	System.out.println(obj.getId());
	
}
}
