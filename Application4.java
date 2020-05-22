
public class Application4 {

	public static void main(String[] args) {
		int[] values;
		values = new int[3];
		System.out.println(values[0]);
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for(int i =0; i<values.length; i++){
			System.out.println(values[i]);
		}
		int[] number = {3,4,5};
		for(int i =0; i<number.length; i++){
			System.out.println(number[i]);
		}
	}

	}
