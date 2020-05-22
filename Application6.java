
public class Application6 {
	public static void main(String[] args) {
	String[] words = new String[3];
	System.out.println(words[0]);
	System.out.println(words[1]);
	words[0] = "Hello";
	words[1] = "to";
	words[2] = "you";
	System.out.println(words[2]);
	
	String[] fruits={"apple" , "banana" ,"mango"};
	for(String fruit : fruits) {
		System.out.println(fruit);
	}
	String[][] test = new String[2][3];
	test[0][1] ="Hello There";
	System.out.println(test[0][1]);
	}
}
