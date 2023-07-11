 
import java.util.Scanner;
public class Conditionall{
    public static void main(String args[]){
        
        Scanner s1=new Scanner(System.in);
                System.out.println("enter any number");

        int num = s1.nextInt();
        switch(num){
            
              case 1:
                System.out.println("monday");
                break;
                case 2:
                System.out.println("tuesday");
                break;
                case 3:
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("thursday");
                break;
                case 5:
                System.out.println("friday");
                break;
                 case 6:
                System.out.println("saturday");
                break;
                case 7:
                System.out.println("sunday");
                break;
        }
    }

//	private static void Switch(int num) {
//		// TODO Auto-generated method stub
//		
//	}
}