

class Muskan12{
	private int id;
	private String name;
	
	public void setName(String a) {
		name=a;
	}
	public String getName() {
		return name;
	}
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
}



public class GetterSetter {
public static void main(String[] args) {
	Muskan12 obj=new Muskan12();
	System.out.print("Name is: ");
	obj.setName("MUSKAN KAUR");
	System.out.println(obj.getName());
	System.out.print("UID is: ");
	obj.setId(2729);
	System.out.print(obj.getId());
	
}
}
