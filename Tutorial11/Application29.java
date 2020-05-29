class Person{
	private int id;
	private String Name;
	public Person(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + "]";
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
public class Application29 {

	public static void main(String[] args) {
		
		System.out.println(new Object());
		Person person1 = new Person(3,"Bob");
		Person person2 = new Person(5,"Charles");
		//person2 = person1;
		System.out.println(person1 .equals(person2));
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
		
		String value3 = "Hello";
		String value4 = "hello";
		String value5 = "Helloadhfg".substring(0,5);
		System.out.println(value5);
		System.out.println(value3 == value4);
		System.out.println(value3. equals(value4));
		System.out.println(value3.equals(value5));

	}

}
