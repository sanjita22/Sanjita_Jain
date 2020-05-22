
public class Person implements showInfo {
	String Name;

	public Person(String Name) {
		this.Name = Name;
	}
	public void greet (){
		System.out.println("Hello There");
	}
	public void Info() {
		System.out.println("Person Name is " + Name);
		
	}
	

}
