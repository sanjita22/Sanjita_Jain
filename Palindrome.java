import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num1 = input.nextInt();
		int num2 = num1;
		int rem,newNum = 0;
		while(num2>0){
		rem = num2 % 10;
		newNum = rem + newNum*10; 
		num2 = num2/10;
		}
		System.out.println(newNum);

	}

}
