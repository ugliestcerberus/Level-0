

	import java.applet.AudioClip;

	import javax.swing.JApplet;
	import javax.swing.JOptionPane;

	public class dontforgetthelyrics {
		/*
		 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
		 * 
		 * 1. To record a sound clip, open Audacity and record your song.
		 * 
		 * 2. Click File -> Export Audio, and save your file on the Desktop.
		 * 
		 * 3. Drag your file from the Desktop into the "default package" under "src".
		 */
		
		public static void main(String[] args) {

	// 4. Make a pop-up to explain the game.

	
JOptionPane.showMessageDialog(null, "I'm going to play part of a song called big sean beware");
playSound("beware.wav");		
String Song=JOptionPane.showInputDialog("Finish the lyrics");

			// 5. Use the playSound method to play your song.

			// 6. Make a pop-up for the player to type their answer.

			// 7. If they answered correctly, tell them that they were right.
if(Song.equals("You should beware, beware, beware of a women with a broken heart")){
	JOptionPane.showMessageDialog(null, "Nice!");
}
else{
	JOptionPane.showInputDialog("wrong,You should beware, beware, beware of a women with a broken heart");
	
}
			// 8. Otherwise, tell them they are wrong, and give them the answer.

			// 9. Record another sound and repeat steps 5-8.

}
			// 10. [optional] Add a points variable that will calculate their final score.
		

		public static void playSound(String fileName) {
			AudioClip audioClip = JApplet.newAudioClip(new dontforgetthelyrics().getClass().getResource(fileName));
			audioClip.play();
		}
	}




