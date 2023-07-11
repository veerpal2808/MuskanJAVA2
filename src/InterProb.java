

interface camera{
	void takesnap();
	void recordvideo();
	default void record4kvideo(){
		
		 System.out.println("recording in 4k");
	}
}

interface wifi{
	void connectToNetwork();
	void disconnectToNetwork();
}

interface mediaplayer{
	void song();
	void playlist();
}
 class cellphone{
	 void call(double number) {
		 System.out.println("Calling..." +number);
	 }
 }

class smartphone extends cellphone implements camera,wifi,mediaplayer{

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


public class InterProb {
public static void main(String[] args) {
	
	
	smartphone obj=new smartphone();
	obj.call(628);
	obj.connectToNetwork();
	obj.disconnectToNetwork();
	obj.song();
	obj.playlist();
	obj.recordvideo();
	
	obj.record4kvideo();
	
}
}



