// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[]args){

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int Ball=new Random().nextInt(4);
	// 3. Print out this variable
System.out.println("Ball");
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Enter a question for the eight ball");
	// 5. If the random number is 0
 if(Ball==0){
	System.out.println("Yes");
 }
 if(Ball==1){
	 System.out.println("No");
 }

	// 7. If the random number is 2
 if(Ball==2){
	 System.out.println("Maybe you should ask Google?");
 }

	// 8. If the random number is 3
if(Ball==3){
	JOptionPane.showInputDialog("What's your own answer.Write it out");
}
	// -- write your own answer

}
}
