import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class dizzytortoise {

	public static void main(String[] args) {
	
		 // 1. Use the dance method to make the Tortoise spin.
		
		  //Ask the user how dizzy you want the tortoise from 1-10, then spin
		 // that number of times.
		String Public=JOptionPane.showInputDialog("How many times do you want the tortoise to spin?");
		int spinNumber=Integer.parseInt(Public); 
		dance(spinNumber);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}


