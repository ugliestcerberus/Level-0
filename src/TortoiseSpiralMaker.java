// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class TortoiseSpiralMaker {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int Sides=0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		JOptionPane.showInputDialog(null, "What spiral do you like?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		int j = 20;
		for (int d = 0; d < 8; d++) {
			
		
		for (int i = 0; i < 4; i++) {
		Tortoise.penDown();
		Tortoise.move(j);
		Tortoise.turn(360/5);
		j+=10;
		}}
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}

}


