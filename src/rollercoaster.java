import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {
		int inches = 48;
		String Inch = JOptionPane.showInputDialog("How many inches tall are you?");
		int inc = Integer.parseInt(Inch);
		if (inc >= 48) {
			System.out.println("Enjoy your ride on the roller coaster");
		}
		if (inc< 48)
			System.out.println("You are too short");
	}
}
