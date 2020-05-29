
public class Robot {
	private int id;
	
	public class brain {
		public void think(){
			System.out.println("Brain" + id + "is thinking");
		}
	}
	static class battery{
		public void charge(){
			System.out.println("Battery is charging");
		}
	}

	public Robot(int id) {
		this.id = id;	
	}
	public void start(){
		System.out.println("Robot Starting..."+ id);
		brain brain = new brain();
		brain.think();
		final String Name = "Robot";
		class Temp{
			public void doSomething(){
				System.out.println("Name is "+ Name);
				System.out.println("Id is :" + id);
			}
		}
		Temp temp = new Temp();
		temp.doSomething();
	}
}
