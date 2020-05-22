class Person{
	
	String Name;
	int age;
	
	void speak(String Name, int age){
		System.out.println("My name is " + Name +" and I am " + age + " years old.");
	}
	
	void sayHello(){
		System.out.println("Hello there!");
	}
	
	int calculateYearsToRetirement(){
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return Name;
	}

	
}
public class Application8 {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.Name = "John";
		person1.age = 26;
		person1.speak("Rakesh", 26);
		person1.sayHello();
		int years = person1.calculateYearsToRetirement();
		System.out.println("Years till Retirement " + years);
		

		Person person2 = new Person();
		person2.Name = "Rahul";
		person2.age = 30;
		person2.speak("Rahul" , 30);
		person2.sayHello();
		
		int age = person1.getAge();
		String Name = person1.getName();
		System.out.println("Name is :" + Name);
		System.out.println("Age is :" + age);
		
		
		System.out.println(person1.Name + person1.age);
		System.out.println(person2.Name + person2.age);
	}

}
