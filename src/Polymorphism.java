interface camera1{
	void takesnap();
	void recordvideo();
	default void record4kvideo(){
		
		 System.out.println("recording in 4k");
	}
}

interface wifi1{
	void connectToNetwork();
	void disconnectToNetwork();
}

interface mediaplayer1{
	void song();
	void playlist();
}
 class cellphone1{
	 void call(double number) {
		 System.out.println("Calling..." +number);
	 }
 }

class smartphone1 extends cellphone1 implements camera1,wifi1,mediaplayer1{

	@Override
	public void song() {
		System.out.println("Playing Rehnuma");
		
	}

	@Override
	public void playlist() {
		System.out.println("Playing lovesick playlist");
		
	}

	@Override
	public void connectToNetwork() {
		
		System.out.println("please wait! connecting to network");
	}

	@Override
	public void disconnectToNetwork() {
		
		System.out.println("oops! disconnect");
	}

	@Override
	public void takesnap() {
		
		System.out.println("smile! taking snap");
	}

	@Override
	public void recordvideo() {
		
		System.out.println("Hey there! i am recording your video");
	}
	
	
	
	
}


public class Polymorphism {
public static void main(String[] args) {
	
	
	camera1 obj= new smartphone1();
	obj.recordvideo();
	
}
}


