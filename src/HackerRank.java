//import java.util.*;
//public class HackerRank {
// public static void main(String[] args) {
//	 
//		 Scanner sc=new Scanner(System.in);
//		 int n=sc.nextInt();
//		 String s=Integer.toString(n);
//		 
//		 if(n==Integer.parseInt(s)) {
//			 System.out.println("Good job");
//		 }
//		 
//		 else {
//			 System.out.println("Bad job");
//		 }
//		 
//		 
//	 
// }
//}
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//import java.time.LocalDate;
//
//class Result {
//
//    
// public static String findDay(int month, int day, int year) {
//        int d = Integer.valueOf(day);
//        int m = Integer.valueOf(month);
//        int y = Integer.valueOf(year);
//        LocalDate date = LocalDate.of(y, m, d);
//        return date.getDayOfWeek().toString();
//    }
//}
//
//public class HackerRank {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}


//import java.io.*;
//import java.util.*;
//
//public class HackerRank {
//
//    public static void main(String[] args) {
//        
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        char ch[]=A.toCharArray();
//        
//        
//        System.out.println(A.length()+B.length());
//        
//        if(A.length()>B.length()) {
//        	System.out.println("No");
//        }
//        else {
//        	System.out.println("Yes");
//        }
//        
//        String firstLet=A.substring(0,1);
//        String remLet=A.substring(1);
//        firstLet=firstLet.toUpperCase();
//        System.out.print(firstLet+remLet);
//        System.out.print(" ");
//        
//        
//        String firstLet2=B.substring(0,1);
//        String remLet2=B.substring(1);
//        firstLet2=firstLet2.toUpperCase();
//        System.out.print(firstLet2+remLet2);
//      }
//    }

//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class HackerRank {
//
//    public static void main(String[] args) {
//   Scanner in = new Scanner(System.in);
//        String S = in.next();
//        int start = in.nextInt();
//        int end = in.nextInt();
//
//        System.out.println(S.substring(start, end));
//        
//    }
//}


//import java.util.Scanner;
//
//public class HackerRank {
//
//    static boolean isAnagram(String a, String b) {
//		
//        String A=a.toLowerCase();
//        String B=b.toLowerCase();
//		
//        if(A.length()!=B.length()) return false;
//           for(int i=0;i<A.length();i++) {
//        	   
//        	   int x=0;
//        	   int y=0;
//        	   for(int j=0;j<A.length();j++) {
//        		   
//        		   if(A.charAt(i)==A.charAt(j));
//        	   }
//           }
//        
        
        
//        
//
//    }
//
//    public static void main(String[] args) {
//    
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//    }
//
//}
//
//
//


//public class HackerRank
//{
//    public static void main(String[] args)
//    {
//         String message = "LOVE UH SO MUCH.. lucky to have uh";
//         int n = 10;
//     for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j <= 4 * n; j++)
//            {
//                double d1 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - n, 2));
//                double d2 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - 3 * n, 2));
// 
//                if (d1< n + 0.5 || d2< n + 0.5) {
//                    System.out.print('*');
//                }
//                else {
//                    System.out.print(' ');
//                }
//            }
//            System.out.print(System.lineSeparator());
//        }
// 
//        for (int i = 1; i < 2 * n; i++)
//        {
//            for (int j = 0; j < i; j++) {
//                System.out.print(' ');
//            }
// 
//            for (int j = 0; j < 4 * n + 1 - 2 * i; j++)
//            {
//                if (i >= 2 && i <= 4)
//                {
//                    int idx = j - (4 * n - 2 * i - message.length()) / 2;
//                    if (idx < message.length() && idx >= 0)
//                    {
//                        if (i == 3) {
//                            System.out.print(message.charAt(idx));
//                        }
//                        else {
//                            System.out.print(' ');
//                        }
//                    }
//                    else {
//                        System.out.print('*');
//                    }
//                }
//                else {
//                    System.out.print('*');
//                }
//            }
//            System.out.print(System.lineSeparator());
//        }
//    }
//}
//
//




//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//class Animal{
//	void walk(){
//		System.out.println("I am walking");
//	}
//}
//
//class Bird extends Animal{
//	void fly(){
//		System.out.println("I am flying");
//	}
//	
//	void sing(){
//		System.out.println("I am singing");
//		
//	}
//}
//
// 
//
//public class HackerRank{
//
//   public static void main(String args[]){
//
//	  Bird bird = new Bird();
//	  bird.walk();
//	  bird.fly();
//      bird.sing();
//	
//   }
//}



//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
////Write your code here
//
//class Arithmetic{
//	int add(int a,int b) {
//		return a+b;
//		
//	}
//}
//
//class Adder extends Arithmetic{
//	
//}
//
//public class HackerRank{
//    public static void main(String []args){
//        // Create a new Adder object
//        Adder a = new Adder();
//        
//        // Print the name of the superclass on a new line
//        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
//        
//        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
//        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
//     }
//}

//
//
//
//import java.nio.channels.NetworkChannel;
//import java.util.*;
//abstract class Book{
//	String title;
//	abstract void setTitle(String s);
//	String getTitle(){
//		return title;
//	}
//}
//
//class MyBook extends Book{
//	void setTitle(String s) {
//       title=s;
//			}
//	
//
//	
//
//	
//	
//}
//
//public class HackerRank{
//	
//	public static void main(String []args){
//		Scanner sc=new Scanner(System.in);
//		String title=sc.nextLine();
//		MyBook new_novel=new MyBook();
//		new_novel.setTitle(title);
//		System.out.println("The title is: "+new_novel.getTitle());
//      	sc.close();
//		
//	}
//}
//

//
//import java.util.*;
//
//interface AdvancedArithmetic{
//  int divisor_sum(int n);
//}
//
//class MyCalculator implements AdvancedArithmetic{
//
//	
//	public int divisor_sum(int n) {
//	int i=1;
//	int sum=0;
//	
//		  for(  i =1;i<=n;i++) {
//			  if(n%i==0) {
////				  System.out.println(i);
//				  sum+=i;
//			  }
//			
//		  }
//		  return sum;
//		  
//	}
//	
//}
//
//public class HackerRank{
//    public static void main(String []args){
//        MyCalculator my_calculator = new MyCalculator();
//        System.out.print("I implemented: ");
//        ImplementedInterfaceNames(my_calculator);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print(my_calculator.divisor_sum(n) + "\n");
//      	sc.close();
//    }
//   
//    static void ImplementedInterfaceNames(Object o){
//        Class[] theInterfaces = o.getClass().getInterfaces();
//        for (int i = 0; i < theInterfaces.length; i++){
//            String interfaceName = theInterfaces[i].getName();
//            System.out.println(interfaceName);
//        }
//    }
//}
//
//import java.util.*;
//class Sports{
//
//    String getName(){
//        return "Generic Sports";
//    }
//  
//    void getNumberOfTeamMembers(){
//        System.out.println( "Each team has n players in " + getName() );
//    }
//}
//
//class Soccer extends Sports{
//    @Override
//    String getName(){
//        return "Soccer Class";
//    }
//    
//    @Override
//    void getNumberOfTeamMembers() {
//    	System.out.println("Each team has 11 players in "+ getName());
//    }
//
//   
//}
//
//public class HackerRank{
//	
//    public static void main(String []args){
//        Sports c1 = new Sports();
//        Soccer c2 = new Soccer();
//        System.out.println(c1.getName());
//        c1.getNumberOfTeamMembers();
//        System.out.println(c2.getName());
//        c2.getNumberOfTeamMembers();
//	}
//}
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//class Result {
//
//    
//    public static void fizzBuzz(int n) {
//        
//        
//        for(int i=1;i<=n;i++)
//        {
//         if(i%3==0 && i%5==0){
//            System.out.println("FizzBuzz");
//            
//        }
//        else if(i%3==0 && i%5!=0){
//             System.out.println("Fizz");
//
//        }
//        else if(i%3!=0 && i%5==0){
//             System.out.println("Buzz");
//
//        }
//        else {
//             System.out.println(i);
//
//        }
//        }
//        
//        
//
//    }
//
//}
//
//public class HackerRank {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        Result.fizzBuzz(n);
//
//        bufferedReader.close();
//    }
//}
//

//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'plusMinus' function below.
//     *
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    public static void plusMinus(List<Integer> arr) {
//    	Scanner sc=new Scanner(System.in);
//    	 n=sc.nextInt();
//    	
//    	
//    	if n
//        
//        
//    }
//
//}
//
//public class HackerRank {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        Result.plusMinus(arr);
//
//        bufferedReader.close();
//    }
//}

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.security.PublicKey;
//import java.util.regex.*;
//
//
//
//public class HackerRank {
//    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//        
//        NumberFormat n1=NumberFormat.getInstance(Locale.US);
//        String us=n1.format(payment);
//        
//        NumberFormat n2=NumberFormat.getInstance(new Locale("en", "IN"));
//        String india=n2.format(payment);
//        
//        NumberFormat n3=NumberFormat.getInstance(Locale.CHINA);
//        String china=n3.format(payment);
//        
//        NumberFormat n4=NumberFormat.getInstance(Locale.FRANCE);
//        String france=n4.format(payment);
// 
//        
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
//    }
//}
//
//


//import java.io.*;
//import java.util.*;
//
//public class HackerRank {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n == (short)n){
//            System.out.println(n + " can be fitted in: \n * short \n * int \n * long ");
//        }else if(n == (int)n){
//          System.out.println(n +" can be fitted in: \n * int \n * long ");
//        }else if(n == (long)n){
//          System.out.println(n + " can be fitted in: \n * long ");
//        }else{
//           System.out.println(n + " can't be fitted anywhere"); 
//    
//        }             
//        
//    }
//}
//
//

//import java.util.*;
//import java.io.*;
//
//
//
//public class Solution{
//    public static void main(String []argh)
//    {
//
//
//
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {
//
//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in:");
//                if(x>=-128 && x<=127){
//                System.out.println("* byte");
//                }
//                else if(x >= Short.MIN_VALUE && x<= Short.MAX_VALUE){
//                  System.out.println("* short");  
//                }
//                 else if(x >= Integer.MIN_VALUE && x<= Integer.MAX_VALUE){
//                  System.out.println("* int");  
//                }
//                 else if(x >= Long.MIN_VALUE && x<= Long.MAX_VALUE){
//                  System.out.println("* long");  
//                }
//                
//                
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }
//    }
//}
//

//import java.util.*;
//import java.io.*;
//
//
//
//public class HackerRank{
//    public static void main(String []args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {
//
//            try
//            {
//                long x=sc.nextLong();
//                
//                System.out.println(x+" can be fitted in:");
////if(x>=Short.MAX_VALUE && x<=Short.MIN_VALUE) {
////                	
////                    System.out.println("* short");
////                    }
//                
//                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) {
//                	
//                    System.out.println("* short");
//                    }
//                
//                else if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) {
//                	
//                    System.out.println("* byte");
//                    }
//                 
//                
//                else if(x<=Long.MAX_VALUE && x>=Long.MIN_VALUE  ) {
//                	
//                    System.out.println("* long");
//                }
//                
//                else if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) {
//                	
//                    System.out.println("* int");
//                    }
//                
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }
//    }
//}


import java.io.*;
import java.util.*;

public class HackerRank {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        
        System.out.println("================================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("================================");
    }
}

//public class HackerRank{
//	public static void main(String[] args) {
//
//int [][]mat1 = {{1,2,3},{4,5,6}};
//int [][]mat2 = {{11,23,33},{44,55,62}};
//        int [][]result = {{0,0,0},{0,0,0}};
//
//        for(int i=0; i<mat1.length; i++){
//            for(int j=0; j<mat1[i].length; j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        
//        for(int i=0; i<mat1.length; i++){
//            for(int j=0; j<mat1[i].length; j++){
//              System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println();
//        
//}}}