import java.io.Serializable;


public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String Name;
	public Person(int id, String name) {
		this.id = id;
		Name = name;
	}
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + "]";
	}
	
	

}
