import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String Feelings = JOptionPane.showInputDialog("Are you feeling happy or not happy?");
		if (Feelings.equals("happy")) {
			JOptionPane.showMessageDialog(null, "Yes,and keep whatever you are doing");
		} else if (Feelings.equals("not happy")) {
		String FeelHappy =JOptionPane.showInputDialog(null, "Do you want to be happy?");
		if(FeelHappy.equals("yes")){
			JOptionPane.showMessageDialog(null, "Change Something");
		}
		else if(FeelHappy.equals("no")){
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
		}
		}
		}
		}
	

	
