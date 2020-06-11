
public class AppEqualOperator {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2= new String(s1);
		String s3 = "Hello";
		String s4 = "hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		// equals method  matches the content of string
		// == operator matches object or reference of the string
		System.out.println();
		System.out.println(s1 ==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		
		

	}

}
