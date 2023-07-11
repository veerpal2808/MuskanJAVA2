


class circle{
	int r;
	int h;
	public circle() {
		r=4;
		h=8;
		
	}
	public int getR() {
		return r;
	}
	public int getH() {
		return h;
	}
	public float area1() {
		return (float) (3.14*r*r);
		
	}
	
}

class cylinder extends circle{
	public cylinder() {
		r=6;
		h=10;
	}
	
	public int getR() {
		return r;
	}
	public int getH() {
		return h;
	}
	public float area() {
		return (float) (2* 3.14  *r*(r+h));
	}
}


public class Problems2 {
public static void main(String[] args) {
    	
	circle obj=new circle();
System.out.println(obj.area1());
	
}
}



