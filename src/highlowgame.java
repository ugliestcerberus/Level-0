
import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

	// Copyright Wintriss Technical Schools 2013
	public class highlowgame {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(100);
			// 2. Print out the random variable above
			System.out.println(random);
			// 11. do the following 10 times
			for (int i = 0; i < 10; i++) {
			
				// 1. ask the user for a guess using a pop-up window, and save their response 
			String random1=	JOptionPane.showInputDialog(null, "What is your number?");
				// 4. convert the users’ answer to an int 
			int Random3=Integer.parseInt(random1);
				// 5. if the guess is correct
			if(Random3==random){
				JOptionPane.showMessageDialog(null, "You win");
				System.exit(0);
			}
			
					// 6. win
		
				// 7. if the guess is high
			if(Random3>random){
				JOptionPane.showMessageDialog(null, "Too High!");
				}
					// 8. tell them it's too high
				if(Random3<random){
					JOptionPane.showMessageDialog(null, "Too Low");
				}
				// 9. if the guess is low
					// 10. tell them it's too low
			}
			// 12. tell them they lose
				JOptionPane.showMessageDialog(null, "You lose");
		}
	}
	
				
