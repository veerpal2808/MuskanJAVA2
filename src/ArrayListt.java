import java.util.*;

public class ArrayListt {

public static void main(String[] args) {
	
	ArrayList<Integer> l1= new ArrayList<>();
	ArrayList<Integer> l2= new ArrayList<>();
l2.add(56);
l2.add(99);
l2.add(87);
l2.add(76);
l2.add(65);
l2.add(57);

	l1.add(3);
	l1.add(5);
	l1.add(7);
	l1.add(2);	
	l1.add(8);
	l1.add(4);
	l1.add(3);
//	l1.add(4,5);
l1.addAll(0,l2);
      //l1.clear();
//l1.clone();
//l2.clone()


	System.out.println(l1.contains(67) );
	System.out.println( );
	l1.set(0, 8378);
    for (int i=0;i<l1.size();i++) {
    	System.out.print(l1.get(i));
    	System.out.print(", " );

    }
}
	
	
}
