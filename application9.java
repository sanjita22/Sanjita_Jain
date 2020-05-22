class Frog{
	private String Name;
	private int age;
	
	public void setName(String Name){
		this.Name=Name;
	}
	public void setAge(int age){
		this.age=age;	
	}
	public String getName(){
		return Name;
	}
	public int getAge(){
		return age;
	}
}


public class application9 {

	public static void main(String[] args) {
		Frog person1 = new Frog();
		person1.setName("Ankit");
		person1.setAge(26);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
	}

}
