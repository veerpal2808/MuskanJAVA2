
class thread1 extends Thread{
	public void run() {
		while(true) {
			System.out.println("I am doing Coding");

			System.out.println("I am confused");
		
		}
	}
}

class thread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("I am doing chat");

			System.out.println("I am happy");
		
		}
	}
}

public class MultiThreading {
public static void main(String[] args) {
	thread1 t1 = new thread1();
	thread2 t2=new thread2();
	t1.start();
	t2.start();
	
}
}
