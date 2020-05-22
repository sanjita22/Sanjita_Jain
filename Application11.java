class Thing{
	public final static int Lucky_Number = 7;
	public String Name;
	public static String description;
	
	public static int count = 0;
	public int id;
	
	public Thing(){
		id = count;
		count++;
	}
	public void showName(){
		System.out.println("Id is :" + id + ", " + description + " : " + Name);
	}
	
	public static void showInfo(){
		System.out.println(description);
	}
}
public class Application11 {

	public static void main(String[] args) {

		Thing.description = "My name is :" ;
		Thing.showInfo();
		System.out.println("Before Count is :" + Thing.count);
		Thing thing1 = new Thing();
		thing1.Name = "Raj";
		System.out.println("After Count is :" + Thing.count);
		thing1.showName();

	}

}
