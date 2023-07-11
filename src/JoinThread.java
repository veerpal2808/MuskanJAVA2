
class myThread extends Thread{
	
	public void run() {
		while(true) {
			System.out.println("Good Afternoon");
		}
	}
}


class myThread2 extends Thread{
	
	public void run() {
		while( true) {
			System.out.println("My Love");
			
		}
	}
}


public class JoinThread {
public static void main(String[] args) {
	myThread t1=new myThread();
	myThread t2=new myThread();
	
	t1.start();
	try {
		t1.join();
	}
	catch(Exception e){
		System.out.println(e);

	}
	
	
	t2.start();

}
}
