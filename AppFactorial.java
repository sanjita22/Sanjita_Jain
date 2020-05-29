
public class AppFactorial {

	public static void main(String[] args) {
		Factorial(3);
		System.out.println(Factorial(3));
		
		}
		private static int Factorial(int value) {
			 if(value == 1){
				 return 1;
				 
			 }
			return Factorial(value-1) * value;
		
	}
		

	

}
