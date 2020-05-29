
public enum Animal {
	Dog("Fido"),Cat("Fergus"),Mouse("Jerry");
	
	private String Name;
	 Animal(String Name){
		 this.Name =Name;
	 }
	public String getName() {
		
		return Name;
	}

}
