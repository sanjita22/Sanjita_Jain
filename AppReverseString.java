

class StringFormatter{
	public static String Reverse(String str){
		StringBuilder sb = new StringBuilder(str);
		 sb.reverse();
		 String rev = sb.toString();
		 if(str.equals(rev))
		return sb.toString();
		 else{
			 return "It is not palindrome";
		 }
			 
		}	
	}

class StringEditer{
	public static String ReverseString(String str){
		char ch[] = str.toCharArray();
		String rev = "";
		for(int i = ch.length-1; i>=0;i--){
			rev+= ch[i];
		}	
		return rev;
	}
	
}
	

public class AppReverseString {

	public static void main(String[] args) {
		
		System.out.println(StringFormatter.Reverse("jatin"));
		System.out.println(StringEditer.ReverseString("jatin"));

	}

}
