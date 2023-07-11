/*
class asia extends Thread{
	public void run() {
		while(true) {
			System.out.println("good morning");

		
		}
	}
}

class basia extends Thread{
	public void run() {
		while(true) {
			System.out.println("welcome");
try {
	Thread.sleep(200);
} catch (InterruptedException e) {
	e.printStackTrace();
}
		
		}
	}
}

public class Problems4 {
public static void main(String[] args) {
	asia t1 = new asia();
	basia t2=new basia();
	t1.start();
	t2.start();
	
}
}*/


class myThr11 extends Thread{
	public myThr11(String name){
		super(name);
	}
	public void run() {
		System.out.println("Good Evening "+ this.getName());
	}
}
public class Problems4 {
public static void main(String[] args) {
	myThr11 t1 =new myThr11("Muskan");
	myThr11 t2=new myThr11("Anu");

	myThr11 t3 =new myThr11("Harry");

	myThr11 t4 =new myThr11("Pawan");

	myThr11 t5=new myThr11("Sehaj");

	myThr11 t6=new myThr11("Arsh");

	t1.setPriority(Thread.MAX_PRIORITY);
	
	t1.start();
	t2.start();

	t3.start();

	t4.start();
	t5.start();
	t6.start();

}
}


















