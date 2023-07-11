
public class Flame{
	public static void main(String[] args) {
	    String name1 = "nivedi";
	    String name2 = "vanshika";
	    String s1 = name1;
	    String s2 = name2;
	    for (int i = 0; i < name1.length(); i++) {
	        for (int j = 0; j < name2.length(); j++) {
	            if (name1.charAt(i) == name2.charAt(j)) 
	            {
	            name1 = name1.replaceFirst(String.valueOf(name1.charAt(i)), "#");
	            name2 = name2.replaceFirst(String.valueOf(name2.charAt(j)), "#");
	            }
	        }
	    }
	    String result = name1 + name2;
	    result = result.replaceAll("#", "");
	    int resultLength = result.length();
	    String baseInput = "flames";
	    char relationIs = 0;
	    int temp = 0;
	    if (resultLength > 0) {
	        temp = resultLength % baseInput.length();
	    }
	    if (temp == 0 && resultLength >= 6) {
	        relationIs = 's';
	    } else {
	        int count = temp - 1;
	        if (count >= 0) {
	            relationIs = baseInput.charAt(count);
	        System.out.println("Relation Betw " + s1 + " and " + s2 + " is:");
	        }
	    }
	    switch (relationIs) {
	        case 'f':
	            System.out.println("friendship");
	            break;
	        case 'l':
	            System.out.println("Lovers");
	            break;
	        case 'a':
	            System.out.println("Affection");
	            break;
	        case 'm':
	            System.out.println("Marriage");
	            break;
	        case 'e':
	            System.out.println("Enemity");
	            break;
	        case 's':
	            System.out.println("Siblings");
	            break;
	        default:
	            System.out.println("FLAME Test works only for different names");
	            break;
	    }
	}
}

	