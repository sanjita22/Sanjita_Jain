import java.util.Scanner;


public class TableGenerator1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for table :");
		int num1 = input.nextInt();
		int num2 = 0;
		
		for (int i = 1; i<=10; i++){
			num2 = num1 * i;
			//System.out.println( num1 + " * " + i + " = " + num2);
			System.out.printf("%d  *  %2d   =  %2d\n",num1,i ,num2);
		}
	}
}
