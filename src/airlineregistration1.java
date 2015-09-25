// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class airlineregistration1 {
	public static void main(String[] args) {
	String first= JOptionPane.showInputDialog("What is your last name?");
	String last= JOptionPane.showInputDialog("What is your first name");
	String dsap= JOptionPane.showInputDialog("What airport are you going to?");
	String birth= JOptionPane.showInputDialog("When is your birthday? ");
	String gender= JOptionPane.showInputDialog("Are you a boy or girl?");
	System.out.println(first+","+last+","+birth+","+gender);
	System.out.println(dsap);
	}
}


