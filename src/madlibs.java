import javax.swing.JOptionPane;

public class madlibs {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		String Help=JOptionPane.showInputDialog("If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String Adjective=JOptionPane.showInputDialog("Enter an adjective.");
		// Get the user to enter a type of liquid
		String Liquids=JOptionPane.showInputDialog("Enter an type of liquid.");
		// Get the user to enter a body part
		String Bodypart=JOptionPane.showInputDialog("Enter a type of body part.");
		// Get the user to enter a verb
		String Verb=JOptionPane.showInputDialog("Enter a verb.");
		// Get the user to enter a place
		String Place=JOptionPane.showInputDialog("Enter a place.");
		//" Fit the user's words into this sentence, and save it in a String:
		String River=" Piranhas are more "+Adjective+"During the day, so cross the river at."+Help+" Piranhas are attracted to fresh "+Liquids+" and will mostlikely take a bite out of your "+Bodypart +"if you"+Verb+".Whateveryou do, if you have an open wound, try to find another way to get back to the "+Place+"Good luck!";
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showInputDialog(River);

	}
}
