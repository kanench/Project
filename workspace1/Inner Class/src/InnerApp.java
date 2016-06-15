
public class InnerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(5);
		robot.play();
		Robot.Brain brain = robot.new Brain();
		brain.think();
	}

}
