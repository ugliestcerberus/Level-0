import javax.swing.JOptionPane;


public class Greeter {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog(null,"hola, What is your name?");
	JOptionPane.showMessageDialog(null, "Hello,What school do you go to?"+ answer);
}
}
