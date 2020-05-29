
public class Person {

	private String Name;
	public Person(String Name){
		this.Name= Name;
	
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String toString() {
		return "Person [Name=" + Name + "]";
	}
	
}
