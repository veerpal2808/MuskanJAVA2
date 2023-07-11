interface sehaj{
	 void meth1();
	void meth2();
}
interface muskan2 extends sehaj{
	void meth3();
	void meth4();
}
class muskan3 implements muskan2{

	@Override
	public void meth1() {
		System.out.println("meth 1");
	}

	@Override
	public void meth2() {
		System.out.println("meth 2");
	}

	@Override
	public void meth3() {
		System.out.println("meth 3");
	}

	@Override
	public void meth4() {
		
		System.out.println("meth 4");
	}
	
}

public class InheriINInterface {
public static void main(String[] args) {
	muskan3 obj=new muskan3();
	obj.meth1();
	obj.meth2();
	obj.meth3();
	obj.meth4();
}
}
