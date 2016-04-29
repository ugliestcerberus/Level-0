import javax.swing.JOptionPane;

public class OwnMadlib {
public static void main(String[]args){
String Noun=JOptionPane.showInputDialog("Enter an noun");
String Adjective=JOptionPane.showInputDialog("Enter an adjective");
String Verb=JOptionPane.showInputDialog("Enter an verb");
String Adverb=JOptionPane.showInputDialog("Enter an adverb");
String Emotion=JOptionPane.showInputDialog("Enter an emotion");
String PastTenseVerb=JOptionPane.showInputDialog("Enter an past tense verb");
JOptionPane.showMessageDialog(null, " An " + Adjective +" "+ Noun +" "+Verb+" a little baby. The little baby feeling\n "+ Emotion+" "+PastTenseVerb+" at the "+Noun +" "+Adverb);
}
}
