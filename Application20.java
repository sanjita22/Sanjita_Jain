import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Application20 {

	public static void main(String[] args) throws FileNotFoundException {
		String FileName = "E:/SANJITAREPORT/Example.Txt";
		File TextFile  = new File(FileName);
		Scanner input = new Scanner(TextFile);
		
		int value = input.nextInt();
		System.out.print(value);
		while(input.hasNextLine()){
			String Line = input.nextLine();
			System.out.println(Line);
		}
		input.close();
	}

}
