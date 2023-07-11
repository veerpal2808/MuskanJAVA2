
public class VarArgs1 {
	
	static void muskan(int ...a) {
		int sum=0;
		
		
		
		for(int i:a) {
			
			sum=sum+i;
		}
		System.out.println(sum);
		int avg=(sum/2);
		System.out.println(avg);
	}
	
	
	public static void main(String[] args) {
		
		muskan(5,6,7,8);
		
		
		
	}
}
