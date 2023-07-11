
class myThr1 extends Thread{
	public myThr1(String name){
		super(name);
	}
	public void run() {
		System.out.println("Good Evening "+ this.getName());
	}
}
public class TPriority {
public static void main(String[] args) {
	myThr1 t1 =new myThr1("Muskan");
	myThr1 t2=new myThr1("Anu");

	myThr1 t3 =new myThr1("Harry");

	myThr1 t4 =new myThr1("Pawan");

	myThr1 t5=new myThr1("Sehaj");

	myThr1 t6=new myThr1("Arsh");

	t1.setPriority(Thread.MAX_PRIORITY);
	
	t1.start();
	t2.start();

	t3.start();

	t4.start();
	t5.start();
	t6.start();

}
}
