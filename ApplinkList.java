import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ApplinkList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> LinkedList = new LinkedList<Integer>();
		doTimings("ArayList", arrayList);
		doTimings("LinkedList", LinkedList);

	}
	public static void doTimings(String type, List<Integer> list){
		for(int i = 0; i<1E5 ; i++){
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		// Add itemsatlast
		for(int i = 0; i<1E5; i++){
			list.add(i);
		}
		for(int i = 0; i<1E5; i++){
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Current Time in " + type + " " +(end-start) + " in  Ms ");
	}

}
