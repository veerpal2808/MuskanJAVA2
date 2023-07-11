import java.io.File;


public class FileHandling {
public static void main(String[] args) {
	File f=new File("muskan1234.txt");
	
if(f.delete()) {
	System.out.println("file is deketed"+f.getName());}
	else {
		System.out.println("file is not deketed");

	}
}

}














