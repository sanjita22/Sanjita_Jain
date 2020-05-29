class Machine{
	public void start(){
		System.out.println("Machine Started........");
	}
}
interface Plant{
	public void grow();
}
public class Application19 {

	public static void main(String[] args) {
		Machine Mach1 = new Machine(){
			public void start(){
				System.out.println("Camera  snapping.....");
			}
		};
		Mach1.start();
		
		Plant Plnt1 = new Plant(){
			public void grow(){
				System.out.println("Plant growing");
			}
			
		};
		Plnt1.grow();
	}

}
