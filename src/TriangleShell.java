import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot Police= new Robot();
	
	void go() {
		//drawTriangle(500); 

		// 6. Make the robot go as fast as possible

		// 4. make a variable to hold the length of the triangle and set it to 50
		int Triangle= 50;
		// 7. Do the following (up to step 10) 60 times

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
		drawTriangle(Triangle);
			// 10. Turn the tortoise 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		Police.penDown();
		Police.setSpeed(10);
		for(int i=0;i<3;i++){
		Police.turn(60);
		Police.move(length);
		Police.turn(60);
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}

