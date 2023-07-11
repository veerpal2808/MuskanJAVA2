import java.util.*;

public class LinkedListt {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1= new LinkedList<>();
		LinkedList<Integer> l2= new LinkedList<>();
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
l1.addAll(l2);
l1.addLast(782368);
l1.addFirst(35156);
	
	    for (int i=0;i<l1.size();i++) {
	    	System.out.print(l1.get(i));
	    	System.out.print(", " );

	    }
	}
		
		
	}

