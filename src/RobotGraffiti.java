import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[]args){
Robot Matthew= new Robot();
Matthew.setSpeed(10);
Matthew.penDown();
Matthew.move(200);
Matthew.turn(135);
Matthew.move(300);
Matthew.turn(270);
Matthew.move(300);
Matthew.turn(135);
Matthew.move(200);
}
}
