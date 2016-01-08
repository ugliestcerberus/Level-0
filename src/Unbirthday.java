import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	
	 
	String birthday= JOptionPane.showInputDialog("When is your birthday?");
	if(birthday.equals("January 7")){
	JOptionPane.showMessageDialog(null, "happy birthday");}
	else{
	JOptionPane.showMessageDialog(null, "Happy on birthday!");
	}
	
	
	
}
}

