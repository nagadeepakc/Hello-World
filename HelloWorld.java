import java.util.Scanner;

public class HelloWorld {

	/**
	 * This is called a block comment.
	 */
	// This is called a line comment.
	public static void main(String[] args) {
		System.out.print("What is your name?");

		Scanner keyboard = new Scanner(System.in);

		String name = keyboard.nextLine();

		System.out.println("Hello " + name);

	}

}
