
class myThr extends Thread{
	
	public myThr( String name) {
		super(name);
	}
	public void run(){
		System.out.println("Good Evening");
		
	}
}

public class ConstThread {
public static void main(String[] args) {
	myThr t =new myThr("Muskan");
	t.start();

	System.out.println("id is "+t.getId());
	System.out.println("name is "+t.getName());


}
}
