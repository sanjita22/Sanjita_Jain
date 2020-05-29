
public class Applikcation30 {

	public static void main(String[] args) {
		Robot robot = new Robot(7);
		robot.start();
		
		//Robot.brain brain = robot.new brain();
		//brain.think();
		
		Robot.battery battery = new Robot.battery();
		battery.charge();

	}

}
