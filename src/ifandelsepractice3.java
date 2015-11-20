import javax.swing.JOptionPane;

public class ifandelsepractice3 {
public static void main(String[] args) {
	String Animal=JOptionPane.showInputDialog(null,"Which animal do you like?");
	if(Animal.equals("dog")){
		System.out.println("Dogs go woof.");
	}else if(Animal.equals("cat")){
		System.out.println("Cats go meow.");
	}else{
		System.out.println("I don't know that animal.");
	}
	}

	


}


