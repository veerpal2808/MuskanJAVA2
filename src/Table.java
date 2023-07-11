

import java.util.*;
public class Table {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Write any number whose table you wanna print");
	int N=sc.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(N + "*" + i + "=" +N*i);
		
	}
}
}
