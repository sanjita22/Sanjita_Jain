import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}
public class Applcation18 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("Banana");
		list.add("Mango");
		String fruit  = (String)list.get(1);
		System.out.println(fruit);
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("Banana");
		list1.add("Mango");
		String fruit1  = list1.get(1);
		System.out.println(fruit1);
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		ArrayList<Animal> someList = new ArrayList<>();
		
	}

}
