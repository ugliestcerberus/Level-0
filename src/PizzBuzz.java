public class PizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 90; i++) {
			if (i % 35 == 0) {
				System.out.println("Pizz-Buzz");
			} else if (i % 5 == 0) {
				System.out.println("pizz");
			} else if (i % 7 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

		}
	}
}
