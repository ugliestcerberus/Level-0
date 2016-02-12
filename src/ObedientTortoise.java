import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(10);
		
		
		String Color= JOptionPane.showInputDialog("What color do you want?");
		if(Color.equals("gray")){
			Tortoise.setPenColor(java.awt.Color.GRAY);
		}
		else if(Color.equals("Red")){
			Tortoise.setPenColor(java.awt.Color.RED);
		}
		String Shape= JOptionPane.showInputDialog("What shape do you want?");
		if(Shape.equals("Circle")){
			drawCircle();}
		else if(Shape.equals("Triangle")){
			drawTriangle();}
		else if(Shape.equals("Square")){
			drawSquare();}
		
		}
		
	

	private static void drawCircle() {
		for(int i=0;i<360;i++){
			Tortoise.move(1);
			Tortoise.turn(1);
		
		}
	}

	private static void drawTriangle() {
		//private static void drawTriangle();
		for (int i = 0; i < 3; i++) {
			Tortoise.move(200);
			Tortoise.turn(120);
		}
	}

	private static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(200);
			Tortoise.turn(90);

		}

	}

}

	
	
