 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 19th";
		String dadsBirthday = "September 30th";
		String myBirthday = "December 4th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Birthday= JOptionPane.showInputDialog("What birthday do you want to discover?");
		// 3. Print out what the user typed
	//JOptionPane.showMessageDialog(null,Birthday);
		// 4. if user asked for "mom"
	if(Birthday.equals("Mom")){
	JOptionPane.showMessageDialog(null, "July 19th");
	}
	else if(Birthday.equals("Dad")){
	JOptionPane.showMessageDialog(null, "September 30th");
	}
	else if(Birthday.equals("Matthew")){
	JOptionPane.showMessageDialog(null,"December 4th");
	}
	else{
		JOptionPane.showMessageDialog(null,"I don't remember that person's birthday!");
	}

	} 
}

