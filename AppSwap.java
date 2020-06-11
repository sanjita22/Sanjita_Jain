
public class AppSwap {

	public static void main(String[] args) {
		//Swapping of two variables
		String a = "Hello";
		String b = "World";
		System.out.println("Before Swap " + a + " " +b);
		a = a+b;
		b= a.substring(0,a.length()-b.length());
		a= a.substring(b.length());
		System.out.println("After Swap " + a + " " +b);

	}

}
