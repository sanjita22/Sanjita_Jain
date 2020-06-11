

//Single Inhertiance

class one{
	public void print_one(){
		System.out.println("Class one");
	}
}

class two extends one{
	public void print_two(){
		System.out.println("Class two");
	}
}
public class AppInherit1 {

	public static void main(String[] args) {
		two g1 = new two();
		g1.print_one();
		g1.print_two();
		

	}

}
