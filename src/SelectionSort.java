
public class SelectionSort {
public static void main(String [] args) {
	
	int [] a= {23,55,21,98,8,6,0};
	int min = 0;
	int temp=0;
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1; j<a.length ;j++) {
			if(a[min]>a[j]) {
				min=j;
				
			}
		}
		
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		
	}
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
}
}}
