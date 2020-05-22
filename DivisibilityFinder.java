import java.util.Scanner;


public class DivisibilityFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Dividend :");
		int Dividend = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter Divisor :");
		int Divisor = input1.nextInt();
		
		if (Dividend % Divisor == 0)
			System.out.println(Dividend + " is divisible by " + Divisor);
		else
			System.out.println(Dividend + " is not divisible by " + Divisor);
	}

}
