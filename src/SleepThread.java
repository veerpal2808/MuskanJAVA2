class myThread4 extends Thread{
	
	public void run() {
		while(true) {
			System.out.println("Good Afternoon");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class myThread5 extends Thread{
	
	public void run() {
		while( true) {
			System.out.println("My Love");
			
		}
	}
}


public class SleepThread {
public static void main(String[] args) {
	myThread4 t1=new myThread4();
	myThread5 t2=new myThread5();
	
	t1.start();
	
	
	
	t2.start();

}
}
