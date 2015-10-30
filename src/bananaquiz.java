// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bananaquiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String Fruit=JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if( Fruit.equals("no")){
	JOptionPane.showMessageDialog(null, "You are crazy!");
	
		}
		else if( Fruit.equals("yes")){
	String Fruit1=JOptionPane.showInputDialog("What is your favorite hobby?");	
		JOptionPane.showMessageDialog(null,Fruit1+" is much better with bananas!");	 
		 }
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	
		}
	}



