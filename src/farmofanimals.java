import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class farmofanimals {

	farmofanimals() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		for (int i = 160; i > 2; i++) {
			String Animal = JOptionPane.showInputDialog("What animal do you like?");
		if(Animal.equals("cow")){
			playMoo();
		}
		if(Animal.equals("dog")){
			playWoof();}
		
		if(Animal.equals("duck")){
			playQuack();}
			
		}
		
	
		/* 2. Make it so that the user can keep entering new animals. */
		
		}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	  String quackFile = "/Users/Guest/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/Guest/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/Guest/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/Guest/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/Guest/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new farmofanimals();
	}

}



