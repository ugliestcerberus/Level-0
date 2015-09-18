import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("pnemonia");
		// 2. Catch the user's answer in a String
		String Nike = JOptionPane.showInputDialog("spell the correct word");
		// 3. If the user spelled the word correctly, speak "correct"
		//JOptionPane.showMessageDialog(null, "CORRECT!!!!!");
		// 4. Otherwise say "wrong"
		if(Nike.equals("pnemonia"))
			speak("CORRECT!!!!!");
		// 5. repeat the process for other words
		else
		JOptionPane.showMessageDialog(null,"Wrong");
		speak("THAT IS DEFINITELY WRONG!!!!!");
	
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
