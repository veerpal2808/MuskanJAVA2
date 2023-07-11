
public class Practice {

	/*for (int i=1;i<=10;i++) {
		
		for (int j=10;j>=1;j--) {
			System.out.print("-");
			
			
		}
		System.out.print("\n");
	}
	
	
	
}
}
	
{
int[] arr= {27,54,67,23,90};
int sum=0;
int i=0;


for( i=0;i<arr.length;i++) {
	
	
	
	sum+=arr[i];
	System.out.println(arr[i]);
	}


System.out.println("sum: ");
System.out.println(sum);
float avg=(sum/2);

System.out.println("avg is: ");
System.out.println(avg);
	
}}



{
	int[] arr= {45,27,54,67,23,90};
	
	int i=0;
	for( i=0;i<arr.length;i++) {
		
		
		
		
		System.out.print(arr[i]+" ");
		}
	
	int a=76
			;
	if(arr[i]==a) {
		System.out.println("yes element is present");
	}else
	{
		System.out.println(" element is not  present");
	}
	
	}
	}









	
	static int multi(int a) {
		for(int i=1;i<=10;i++) {
			
			System.out.println(a+"*"+i+"="+a*i);
		}
		return a
				;}
		
		public static void main(String[] args) {
			
			int x=9;
			System.out.println(multi(x));
		}
	}
	

	
	static void stars(int a) {
	for(int i=0;i<a;i++) {
		
		for(int j=0;j<i+1;j++) {
			System.out.println("*");
		}
		System.out.println();
		}
	
		
	}
	public static void main(String[]args) {
		stars(9);
	}
	
	}*/
	
	
	
	static int fab(int n) {
		if (n==0) {
			return 0;
		}
		else if(n==1){
			return 1;
			
		}
		else {
			return fab(n-1)+fab(n-2);
		}
	}
	
	
	







	public static void main(String[]args) {
		int result=fab(6);
		
		System.out.println(result);
		
	}

}







