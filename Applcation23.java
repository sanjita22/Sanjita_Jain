import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class Applcation23 {

	public static void main(String[] args)  {
		Test test  = new Test();
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			System.out.println("MultiCatch Error");
		}
		*/
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Parse Exception");
		}
		*/
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IoException");
		}
		
		String[] newName = {"Raj","Sonalee","Akrati"};
		try{
		
		System.out.println(newName[4]);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		

	}

}
