package Assignment1;

import java.io.IOException;

public class Menu {
	public static int list() throws IOException {
		System.out.println("\n List of Operators");
		System.out.println("\n 1.Division");
		System.out.println("\n 2.Addition");
		System.out.println("\n 3.Multiplication");
		System.out.println("\n 4.Subtraction");
		System.out.println("\n 5.Square");
		System.out.println("\n 6.Cube");
		System.out.println("Enter your option?");
		int r = Exception.readInteger();
		return (r);
	}

}
