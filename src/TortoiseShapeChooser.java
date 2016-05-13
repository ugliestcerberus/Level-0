import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class TortoiseShapeChooser {
	public static void main(String[] args) {
		Tortoise.show();
		String Turtle = JOptionPane.showInputDialog("What shape do you like?");
		if (Turtle.equals("triangle")) {
			for (int i = 0; i < 3; i++) {
				Tortoise.setSpeed(10);
				Tortoise.move(100);
				Tortoise.turn(120);
			}
		} else if (Turtle.equals("square")) {
			for (int j = 0; j < 4; j++) {
				Tortoise.setSpeed(10);
				Tortoise.move(100);
				Tortoise.turn(90);
			}
		}else if(Turtle.equals("circle")){
				for(int i=0;i<300;i++){
				Tortoise.penDown();
				Tortoise.setSpeed(10);
				Tortoise.move(5);
				Tortoise.turn(1.6);
			}
		}
	}
}
