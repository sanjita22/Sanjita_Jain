class Machine{
	public void start(){
		System.out.println("Machine Started");
	}
}
class Camera extends Machine {
	public void start(){
		System.out.println("Camera Started");
	}
	public void snap(){
		System.out.println("Photo Clicked");
	}
}

public class Application17 {

	public static void main(String[] args) {
	Machine machine1 = new Machine();
	Camera cam1 = new Camera();
	machine1.start();
	cam1.start();
	cam1.snap();
	
	//Upcasting
	Machine machine2 = cam1;
	machine2.start();
	
	//Downcasting
	Machine machine3 = new Camera();
	Camera cam2 = (Camera)machine3;
	cam2.start();
	cam2.snap();
	
	Machine machine4 = new Machine();
	//Camera cam3 = (Camera)machine4;
	//cam3.start();
	//cam3.snap();

	String Name1 = "Kresha";
	String Name2 = "Jain";
	String Name3 = Name1.concat(Name2);
	System.out.println(Name3);
	System.out.println("Length of String :" + Name1.length());
	System.out.println("Index of E :" + Name1.indexOf('e'));
	System.out.println("Character at :" + Name1.charAt(5));
	}

}
