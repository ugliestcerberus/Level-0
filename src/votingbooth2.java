import javax.swing.JOptionPane;

public class votingbooth2 {
	public static void main(String[] args) {
		String Vote = JOptionPane.showInputDialog("Who would you vote for?");
		String Age = JOptionPane.showInputDialog("How old are you?");
		int ages = Integer.parseInt(Age);
		if (ages >= 18) {
			JOptionPane.showMessageDialog(null, Vote + " will win");
		} else if (ages < 18) {
			JOptionPane.showMessageDialog(null, "You are too young to vote");
		}

	}
}
