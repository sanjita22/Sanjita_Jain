class Machine{
	private String Name;
	private int code;
	
	public Machine(){
		this("Arnie",6);
		System.out.println(" First Constructor Running.");
		
	}
	public Machine(String Name){
		this(Name,6);
		System.out.println(" Second Constructor Running.");
		this.Name=Name;
		
	}
	public Machine(String Name,int code){
		
		System.out.println(" Third Constructor Running.");
		
	}
}


public class Application10 {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Ratan");
		Machine machine3 = new Machine("Gates", 7);

	}

}
