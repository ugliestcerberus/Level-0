import javax.swing.JOptionPane;

public class BirthdayAndUnbirthday{
public static void main(String[]args){
String Birthday= JOptionPane.showInputDialog("When is your bithday");
if(Birthday.equals("4/14")){
JOptionPane.showMessageDialog(null, "Happy Birthday");
}
else{
JOptionPane.showMessageDialog(null,"Happy Unbirthday");
}
}
}
