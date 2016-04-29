import javax.swing.JOptionPane;

public class Summer {
public static void main(String[]args){
String name=JOptionPane.showInputDialog("What is your name?");
String activity= JOptionPane.showInputDialog("What did you do last summer?");
JOptionPane.showMessageDialog(null,"I know you "+activity+ " last summer  "+name);
}
}
