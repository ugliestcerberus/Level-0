import javax.swing.JOptionPane;


public class greeter1 {
public static void main(String[] args) {
String name= JOptionPane.showInputDialog("What is your favorite subject?");
JOptionPane.showMessageDialog(null, " you like to learn!"+name);
}
}
