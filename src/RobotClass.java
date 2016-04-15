import org.jointheleague.graphical.robot.Robot;

public class RobotClass {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
	Robot Angry= new Robot();
		// 3. Put the robot's pen down
	Angry.penDown();
	Angry.setSpeed(10);
	for(int i=0; i<4;i++){
	Angry.move(200);
	Angry.turn(90);
	}
}
}
