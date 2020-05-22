
public class Machine implements showInfo{
	String name= " Baleno";
	private int id = 7 ;
	public void start(){
		System.out.println("Machine Started");
	}
	public void stop(){
		System.out.println("Machine Stopped");
	}
	public void Info() {
		System.out.println("Machine Id is :" + id);
	}
	
}
