import java.io.Serializable;


public class Person implements Serializable {
	
	//private static final long serialVersionUID = -4929383411080376894L;
	private transient int id;
	private String Name;
	private static int count;
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Person.count = count;
	}
	public Person(){
		System.out.println("Default Constructor");
	}
	public Person(int id, String name) {
		this.id = id;
		Name = name;
		System.out.println("Two argument Condtructor");
	}
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + "]" +" Count is" + count;
	}

}
