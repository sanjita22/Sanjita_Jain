
public class Application13 {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.stop();
		car1.showInfo();
		
		Person person1 = new Person("Bob");
			person1.greet();
			showInfo info1 = new Machine();
			info1.Info();
			showInfo info2 = person1;
			info2.Info();
			
		outputInfo(mach1);
		outputInfo(person1);

	}
	public static void outputInfo(showInfo Info){
		Info.Info();
	}

}
