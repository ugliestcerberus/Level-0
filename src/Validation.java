import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int randomNumber = new Random().nextInt(5);
			System.out.println(randomNumber);
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "You look good!");
			} else if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "You are awesome");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "let's go to the movies");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "Let's practice our boxing skills");
			} else if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "Let's go shopping");
			}
		}
		// 5. Find someone to test out your program. They will like it :)

	}
}
