import java.util.Scanner;


public class Application5 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a command :");
		String value = scanner.nextLine();
		switch(value) {
		case "start":
			System.out.println("Machine Started");
			break;
		case "stop":
			System.out.println("Machine Stoped");
		default :
			System.out.println("Command Not recognized");
			
		}
		
	}
}
