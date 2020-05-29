
public class Application31 {
	
	public static final int Dog =0;
	public static final int Cat= 1;
	public static final int Mouse = 2;
	

	public static void main(String[] args) {
		Animal animal = Animal.Cat;
		
		//int animal = Cat;
		switch(animal){
		case Dog:
			System.out.println("Dog");
			break;
		case Cat :
			System.out.println("Cat");
			break;
		}
		System.out.println(Animal.Cat.getClass());
		System.out.println(Animal.Cat instanceof Animal);
		System.out.println(Animal.Cat.getName());

	}

}
