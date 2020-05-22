import java.util.Scanner;


public class MaxFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num1 = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num2 = input1.nextInt();
		
		if (num1> num2)
			System.out.println(num1 +" is greater than " + num2);
		else
			System.out.println(num2 +" is greater than " + num1);
	

	}

}
