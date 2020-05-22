import java.util.Scanner;


public class EvenOddFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num1 = input.nextInt();
		
		if ((num1%2) == 0){
			System.out.println(num1 + " is even");
		}
		else 
			System.out.println(num1 + " is odd");
	}

}
