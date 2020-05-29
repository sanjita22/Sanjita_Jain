
public class AppPassValue {

	public static void main(String[] args) {
		AppPassValue app1 = new AppPassValue();
		int value = 7;
		System.out.println("1.Value is: " +value);
		app1.show(value);
		System.out.println("4.Value is: " +value);
		
		Person person = new Person("Mick");
		System.out.println("1 person" +person);
		app1.show(person);
		System.out.println("4.person" + person);
	}
	public void show(int value){
		System.out.println("2.Value is: " +value);
		value = 8;
		System.out.println("3.Value is: " +value);
	}

	public void show(Person person){
		System.out.println("2.person"+ person);
		person = new Person("Ricky");
		System.out.println("3.person"+ person);
		
		
	}
}
