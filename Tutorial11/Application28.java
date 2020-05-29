import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Application28 {

	public static void main(String[] args) {
		File file = new File("test.txt");
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			String line;
			br.write("This is one line");
			br.newLine();
			br.write("This is line two");
			br.newLine();
			br.write("This is last line");
			
		
		}catch(IOException e){
			System.out.println("Unable to read file" + file.toString());
		}

	}

}
