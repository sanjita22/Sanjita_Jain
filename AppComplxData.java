import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class AppComplxData {

	public static String[] vehicles = { "Ambulance", "Helicopter", "Lifeboat" };

	public static String[][] drivers = { { "Jack", "Jill", "Joe" },
			{ "Sue", "Richard", "Bob" }, { "Ricky", "Micky" },

	};

	public static void main(String[] args) {
		Map<String, Set<String>> personel = new HashMap<>();
		for(int i=0; i<vehicles.length; i++){
			String vehicle= vehicles[i];
			String[] driverlist = drivers[i];
			Set<String> driverSet = new LinkedHashSet<String>();
			for(String driver : driverlist){
				driverSet.add(driver);
			}
			personel.put(vehicle,driverSet);
		}
		{
		Set<String> driverlist = personel.get("Helicopter");
		for(String driver : driverlist)
			System.out.println(driver);
		
		}
		///for whole iteration
		for(String Vehicle : personel.keySet()){
			System.out.print(Vehicle);
			System.out.print(":");
			Set<String> driverlist = personel.get(Vehicle);
			for(String driver : driverlist){
				System.out.print(driver);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
