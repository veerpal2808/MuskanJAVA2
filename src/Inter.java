
interface bicycle{
	void breakapply();
	void speedup();
}
interface motorbike{
	void blowhorn();
	void slip();
	
}

class result implements bicycle,motorbike{

	@Override
	public void blowhorn() {
		System.out.println("blow horn ");
		
	}

	@Override
	public void slip() {
		System.out.println("slipp ");
		
	}

	@Override
	public void breakapply() {
		System.out.println("applying break ");
		
	}

	@Override
	public void speedup() {
		System.out.println("increase speed ");
		
	}
	
}



public class Inter {
public static void main(String[] args)

{
	result obj=new result();
	obj.breakapply();
	obj.blowhorn();
}
	
}