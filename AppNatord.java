import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String Name;
	public Person(String Name){
		this.Name = Name;
	}
	public String toString(){
		return Name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}
	
		
	
	public int compareTo(Person person) {
		//return Name.compareTo(person.Name);
		int len1 = Name.length();
		int len2 = person.Name.length();
		if (len1>len2)
			return 1;
		else if(len2>len1)
			return -1;
		else
			return 0;
	}
	
	
}
public class AppNatord {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();
		addElements(list);
		addElements(set);
		showElements(list);
		showElements(set);

	}
	private  static void addElements(Collection<Person> Col){
		Col.add(new Person("Ricky"));
		Col.add(new Person("Micky"));
		Col.add(new Person("Sue"));
		Col.add(new Person("Julie"));
		Col.add(new Person("Clare"));
	}

	private static void showElements(Collection<Person> Col){
		for(Person element : Col)
			System.out.println(element);
	}
}
