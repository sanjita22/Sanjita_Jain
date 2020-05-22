import java.util.Scanner;


public class Application2 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter a number:");
		int value = input1.nextInt();
		System.out.println("You entered:" + value);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter a Decimal Number:");
		double value1 = input2.nextDouble();
		System.out.println("You entered:" + value1);

	}

}
