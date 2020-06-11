import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class AppSets {

	public static void main(String[] args) {
		//Set<String> Set1 = new HashSet<String>();
		//Set<String> Set1 = new LinkedHashSet<String>();
		Set<String> Set1 = new TreeSet<String>();
		Set1.add("Dog");
		Set1.add("Cat");
		Set1.add("Mouse");
		System.out.println(Set1);
		
		for(String element : Set1){
			System.out.println(element);
		}
		if (Set1.contains("animals")){
			System.out.println("Contains ANimals");
		}
		if (Set1.contains("Cat")){
			System.out.println("Contains cat");
		}
		Set<String> set2 = new TreeSet<String>();
		set2.add("Dog");
		set2.add("Cat");
		
		set2.add("giraffe");
		set2.add("horse");
		
		Set<String> intersection= new HashSet<String>(Set1);
		System.out.println(intersection);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		Set<String> difference= new HashSet<String>(Set1);
		System.out.println(difference);
		difference.removeAll(set2);
		System.out.println(difference);
		
		

	}

}
