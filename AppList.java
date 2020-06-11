import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AppList {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("Elephant");
		animals.add("Cow");
		animals.add("Horse");
		animals.add("Dog");
		Collections.sort(animals);
		for(String animal : animals){
			System.out.println(animal);
			
			List<Integer> numbers = new ArrayList<Integer>();
			numbers.add(1);
			numbers.add(6);
			numbers.add(4);
			numbers.add(8);
			Collections.sort(numbers);
			for(Integer number : numbers){
				System.out.println(number);	
		}
		

	}
	}
		}

