import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ReadObjects {
	public static void main(String[] args) {
		try (FileInputStream fi  = new FileInputStream("test.bin")){
			ObjectInputStream oi = new ObjectInputStream(fi);
			Person[] people = (Person[])oi.readObject();
			ArrayList<Person> peopleList = (ArrayList <Person>)oi.readObject();
			for(Person person : people){
				System.out.println(person);
			}
			for(Person person : peopleList){
				System.out.println(person);
			}
			int num= oi.readInt();
			for (int i= 0;i<num;i++){
				Person person = (Person)oi.readObject();
				System.out.println(person);
			}
			oi.close();
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}


