
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class changecalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickel = Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
		String Dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dime = Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
		String Quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quater = Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable
		double Money = nickel * 5 + dime * 10 + quater * 25;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have" + Money);
	}
}
