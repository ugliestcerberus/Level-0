import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
		Robot matthew= new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		matthew.setSpeed(10);
		// 5. Set the pen width to 5
		matthew.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for(int i=0;i<4;i++){
		matthew.setRandomPenColor();
		
		
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
		drawSquare();
	// 8. Turn the robot 90 degrees to the right
		matthew.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
	JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
	for(int i=0;i<4;i++){
	matthew.penDown();
	matthew.move(150);
	matthew.turn(90);
	}	
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



