import java.util.ArrayList;


public class AppArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(50);
		number.add(70);
		System.out.println(number.get(0));
		for(int i= 0; i< number.size(); i++)
			System.out.println(number.get(i));
		
		number.remove(0);
		number.remove(number.size() - 1);
		System.out.println("\n Iteration 2.");
		for(Integer value : number)
			System.out.println(value);
	}

}
