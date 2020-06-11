import java.util.HashMap;
import java.util.Map;


public class AppHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "One");
		map.put(5,"Five");
		map.put(6, "Six");
		map.put(8, "Eight");
		map.put(6, "Hello");
		String text = map.get(1);
		String text1 = map.get(6);
		String text2 = map.get(2);
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
		
		for(Map.Entry<Integer,String> entry : map.entrySet()){
			int Key = entry.getKey();
			String Value = entry.getValue();
			System.out.println(Key + ":" + Value);
			
		}
	}

}
