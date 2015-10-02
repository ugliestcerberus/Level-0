import javax.swing.JOptionPane;


public class MyAges {
public static void main(String[] args) {
 String Age=JOptionPane.showInputDialog("How old are you?");
 int age=Integer.parseInt(Age);
for (int i = 0; i <= age; i++) { 
	System.out.println(i);
	
}
}
}
