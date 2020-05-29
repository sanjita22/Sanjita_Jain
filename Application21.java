import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Application21 {

	public static void main(String[] args) {
	File file = new File("test.txt");
	try {
		FileReader fr = new FileReader(file);
		System.out.println("Fie Name is " + file);
	} catch (FileNotFoundException e) {
		System.out.println("File Not Found " + file.toString());
	}

	}

}
