
//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class candycrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
	String Boring =	JOptionPane.showInputDialog("Who you don't like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + Boring + "!");
		// 3. Ask the user for the name of their best friend
	String Person= JOptionPane.showInputDialog(" What is the name of your best friend?" );
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, "Their best friend is as sweet as candy" + Person);
	} 
}
