
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
public class AirlineRegistration {
	public static void main(String[] args) {
	String name =	JOptionPane.showInputDialog(null, "What is your first name?");
	String surname =	JOptionPane.showInputDialog(null, "What is your last name?");
	String airport =	JOptionPane.showInputDialog(null, "What airport do you mainly go to?");
	String birthday=  JOptionPane.showInputDialog(null, "When is your birthday?");
	String gender=   JOptionPane.showInputDialog(null, "Are you a male or female?");
	
	JOptionPane.showMessageDialog(null,surname+"/"+"/"+name+"/"+birthday+"/"+gender+"/Traveling to airport"+airport);
	
	}
}



