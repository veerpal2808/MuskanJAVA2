
public class VarArgs {
static int sum(int ...muskan)
{
	int result=0;
	for (int a:muskan) {
		result+=a;
	}
	return result;
	
}
	public static void main(String[] args) {
		System.out.println(sum(2));
		System.out.println(sum(4,6,11));
		System.out.println(sum(4,6,223,43));
		System.out.println(sum(4,6,43,55,77));
		System.out.println(sum(4,6,32,90,543,2));
		System.out.println(sum(4,6,23,45,67,89,90));
		
		
	}
	

}
