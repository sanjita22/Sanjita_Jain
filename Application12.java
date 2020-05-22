
class Frogger{
	private int id;
	private String fullName;
	
	public Frogger(int id , String fullName){
		this.id= id;
		this.fullName= fullName;
	}
	
	public String toString(){
		
		//return String.format("%4d  : %s ",id,fullName );
		
		StringBuilder ab = new StringBuilder();
		ab.append(id). append( " : ") .append(fullName);
		return ab.toString();
		
	}
}

public class Application12 {

	public static void main(String[] args) {
	 StringBuilder name = new StringBuilder();
	 name.append("Hello");
	 name.append(" u");
	 name.append(" there ");
	 System.out.println(name);
	 
	 StringBuilder newName = new StringBuilder();
	 newName.append("Hello") .append(" How are u");
	 System.out.println(newName);
	 
	 Frogger frog1 = new Frogger(1,"Rogger");
	 Frogger frog2 = new Frogger(2,"Freddy");
	 System.out.println(frog1);
	 System.out.println(frog2);
	}

}
