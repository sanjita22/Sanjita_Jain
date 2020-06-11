import java.util.Iterator;
import java.util.LinkedList;


public class Appitrator {

	public static void main(String[] args) {
		LinkedList<String> animal = new LinkedList<String>();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Cow");
		animal.add("Horse");
		Iterator<String> it = animal.iterator();
		
		while(it.hasNext()){
		
		String value = it.next();
		System.out.println(value);
		if(value .equals("Cat"))
			it.remove();
		}
		for(String animals : animal)
			System.out.println(animals);
	}

}
