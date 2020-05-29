import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class WriteObjects {
	public static void main(String[] args) {
		Person[] people = {(new Person(34,"Mike")),(new Person(35,"Sue")), (new Person(36,"Ricky"))};
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		try(FileOutputStream fs = new FileOutputStream("test.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(people);
			Person.setCount(88);
			os.writeObject(peopleList);
			os.writeInt(peopleList.size());
			for (Person person : peopleList){
				os.writeObject(person);
			}
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
