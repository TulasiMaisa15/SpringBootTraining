package Assignment1;

public class Calculator {

	public static void main(String[] args) {
		
		int x=20,y=30;
		
		FirstMath fm=new FirstMath();
		fm.add(x, y);
		fm.sub(x, y);
		fm.mult(x, y);
		fm.square(x);
		fm.cube(x);
		
		
	}

}
