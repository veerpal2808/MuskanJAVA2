


class animal{
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public char[] gety() {
		// TODO Auto-generated method stub
		return null;
	}

	public void sety(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
class dog{
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}






public class Inheritence{
	public static void main(String [] args) {
		animal obj=new animal();
		
		obj.setX(8);
		System.out.println(obj.getX());
		
dog obj1= new dog();
		
	obj1.setY(5)
	;
	System.out.println(obj1.getY());

		
	}
}






