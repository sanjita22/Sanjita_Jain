//Multiple Inhertiance

class one1{
	public void print_one(){
		System.out.println("Class one");
	}
}

class two2 extends one1{
	public void print_two(){
		System.out.println("Class two");
	}
}
class three extends two2{
	public void print_three(){
		System.out.println("Class three");
	}
}
public class AppInherit2 {

	public static void main(String[] args) {
		three g2 = new three();
		g2.print_one();
		g2.print_three();
		g2.print_two();

	}

}
