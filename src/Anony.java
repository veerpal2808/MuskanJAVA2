
interface DemoAno{
	public void meth1();
	public void meth2();
}





public class Anony {
public static void main(String[] args) {
	DemoAno obj=new DemoAno() {

	
		public void meth1() {
			System.out.println("meth1");
			
		}

		public void meth2() {
			
			
		}

		
	};
	obj.meth1();
}
}
