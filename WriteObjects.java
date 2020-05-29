import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObjects {

	public static void main(String[] args) {
		Person person1 = new Person(34,"Mike");
		Person person2  = new Person(45,"Ricky");
		System.out.println(person1);
		System.out.println(person2);
		try(FileOutputStream fs = new FileOutputStream("people.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(person1);
			os.writeObject(person2);
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
