import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class AppSortedMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		LinkedHashMap<Integer,String> Linkedhashmap = new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> Treemap = new TreeMap<Integer,String>();
		testMap(hashmap);
		testMap(Linkedhashmap);
		testMap(Treemap);
		
	}
	public static void testMap(Map<Integer,String> map){
		map.put(1, "One");
		map.put(5, "Five");
		map.put(7,"Seven");
		map.put(10, "Ten");
		map.put(11, "Eleven");
		map.put(2, "Two");
		for(Integer key :map.keySet()){
			String value = map.get(key);
			System.out.println(key + " :" + value);
			
		}
		
	}

}
