import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Score=0;
		JOptionPane.showInputDialog("Score");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		String Riddle= JOptionPane.showInputDialog("When is a man drowned, but still not wet");
		if(Riddle.equals("He's trapped in quicksand")){
			System.out.println("Correct");
			Score++;
			System.out.println(Score);
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}else{
		System.out.println("Wrong, The right answer is He's trapped in quicksand");
	}
}
}


