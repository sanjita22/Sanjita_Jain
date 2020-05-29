import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Temp implements AutoCloseable{
	public void close() throws Exception{
		System.out.println("Closing");
		throw new Exception("oh no!!!");
	}
}
public class Application27 {

	public static void main(String[] args) {
		/*
		Temp temp = new Temp();
		try {
			temp.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		/*
		try (Temp temp = new Temp()) {
		} catch (Exception e){
			// TODO Auto-generated catch block
						e.printStackTrace();
			
		}
		*/
		File file = new File("test.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine())!= null){
				System.out.println(line);
			}
		}catch (FileNotFoundException e){
			System.out.println("File Not Found" + file.toString());
			
		}catch(IOException e){
			System.out.println("Unable to read file" + file.toString());
		}
		
		

	}

}
