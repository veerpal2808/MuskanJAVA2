
class runThread1 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("i am cooking pasta");
		}
		
	}
	
}

class runThread2 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("i am eating fries");
		}
		
	}
	
}
public class MultiThreading2 {
public static void main(String[] args) {
	runThread1 a1=new runThread1();
	Thread t1=new Thread(a1);
	
	runThread2 a2=new runThread2();
	Thread t2=new Thread(a2);
	
	t1.start();
	t2.start();
}
}
