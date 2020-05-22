import java.util.Scanner;


public class DigitCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit:");
		int num1 = input.nextInt();
		
		int digit = 0;
		while(num1 > 0){
			digit++;
			num1 = num1 /10;
			
		}
		System.out.println(" Digit Count is " + digit);

	}

}
