import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FruitQuiz extends KeyAdapter {

	void makeQuestions() {
		question1 = new JLabel("<html>Which is not a good clothing? <br> A: Socks <br> B: Tank Top <br> C:T-Shirt </html>");
		question2 = new JLabel("<html>What is not my favorite electronic? <br> A: apple iphone <br> B: motorola moto <br> C:compass phone</html>");
		question3= new JLabel("<html>What is not my favorite food? <br> A: carrots <br> B: onions <br> C: corn</html>");
		question4= new JLabel("<html>What is not my favorite shoe? <br> A: Nike <br> B: Sketchers <br> C: Adidas</html>");
	

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		// 1. Print out the key code variable
		System.out.println(keyCode);

		// 2. Make 3 variables that hold the key codes for apple, banana and carrot
		int apple = 37;
		int banana = 39;
		int carrot = 40;

		if (question1.isShowing()) {
			if (keyCode == apple) {
				correct();
				nextQuestion(question2);
			} else  {
				incorrect();
			}
		}

		if (question2.isShowing()) {
			if (keyCode == carrot) {
				correct();
				nextQuestion(question3);
			} else  {
				incorrect();
			}
		}
		if (question3.isShowing()) {
			if (keyCode == banana) {
				correct();
				nextQuestion(question4);
			} else  {
				incorrect();
			}
		}
	
		if (question4.isShowing()) {
			if (keyCode == banana) {
				correct();
				nextQuestion(question1);
			} else  {
				incorrect();
			}
		}
	}

	private void correct() {
		playSound("correct.wav");

	}

	private void incorrect() {
		// 10. Find a sound for wrong answers and put it in the default package. Use the playSound method to play it.
		playSound("wrong.wav");

	}

	private void nextQuestion(JLabel newQuestion) {
		frame.remove(question1);
		frame.remove(question2);
		frame.remove(question3);
		frame.remove(question4);
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(), question5;
}
