
/*abstract class pen{
	abstract void write() ;
	abstract void refill();
}

class muskan6{
	public void write() {
		System.out.println("write your name with pen");
	}
	
	public void refill() {
		System.out.println("refill your pen");

	}
}

class fountainpen extends muskan6{
	public void changenib() {
		System.out.println("change its nib");

	}
}


public class Problems3 {
public static void main(String[] args) {
	  
	fountainpen obj=new fountainpen();
	obj.changenib();
}
}


interface basicAnimal{
	void eat();
	void sleep();
	
}

class monkey{
	public void jump() {
		System.out.println("see that monkey jump over the trees");
	}
	
	public void bite() {
		System.out.println("ouch! that stupid monkey bite me ");

	}
}

class human extends monkey implements basicAnimal{

	@Override
	public void eat() {
		System.out.println("some animal eat humans too ");

	}

	@Override
	public void sleep() {
		System.out.println("animals sleeps at morning ");

	}
	
}

public class Problems3{
	public static void main(String[] args) {
		monkey obj=new human();
		obj.jump();
	}
}


*/

interface TVremote{
	void mainbutton();
	void pressbutton();
}

interface smartTVremote extends TVremote{
	void smarttouch();
	void sensor();
}

class Remote implements TVremote{

	@Override
	public void mainbutton() {
		System.out.println("press main red button");

	}

	@Override
	public void pressbutton() {
		System.out.println("press any button to change cannel ");

	}

	

	}
	





public class Problems3{
	public static void main(String [] args) {
		Remote obj= new Remote();
		obj.pressbutton();
	}
}












