package Assignment1;

public class FirstMath {
	
	public void add(int x,int y) {
		int value=x+y;
		System.out.println("Addition value is"+value);
	
	}
	
	public void sub(int x,int y) {
		int value = 0;
		if(x > y) {
			value = x-y;
		} else {
			value = y-x;
		}
	
		System.out.println("Subtraction value is"+value);
	
	}
	
	public void mult(int x,int y) {
		int value=x*y;
		System.out.println("Multiplication value is"+value);
	
	}
	public void square(int x) {
		int value=x*x;
		System.out.println("Square value is"+value);
	
	}
	public void cube(int x) {
		int value=x*x*x;
		System.out.println("Cube value is"+value);
	
	}
}
