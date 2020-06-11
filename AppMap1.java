import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

 class Person{
	private int id;
	private String Name;
	
	public Person(int id, String name) {
		
		this.id = id;
		Name = name;
	}

	@Override
	public String toString() {
		return "Id is =" + id + ", Name=" + Name ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		return true;
	}
	
}

public class AppMap1 {
	public static void main(String[] args) {
		Person p1 = new Person(1,"One");
		Person p2 = new Person(2,"Two");
		Person p3 = new Person(3,"Three");
		Person p4 = new Person(2,"Two");
		
		Map<Person,Integer> map= new HashMap<Person,Integer>();
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 5);
		map.put(p4,3);
		for(Person key : map.keySet()){
			System.out.println(key +" :" + map.get(key) );
		}
		
		Set<Person> set1= new LinkedHashSet<Person>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		System.out.println(set1);
		
		

	}

}
