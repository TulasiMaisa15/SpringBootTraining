package Assignment1;

import java.io.IOException;

public class TestCalc {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Enter the 1st Number");
		int value1=Exception.readInteger();
		
		System.out.println("Enter the  2nd Number");
		int value2=Exception.readInteger();
		
		int r=Menu.list();
		FirstMath fm=new FirstMath();
		
		if(r==1) {
			fm.div(value1, value2);
		}else if(r==2) {
			fm.add(value1, value2);
		}else if(r==3) {
			fm.mult(value1, value2);
		}else if(r==4) {
			fm.sub(value1, value2);
		}else if(r==5) {
			fm.square(value1);
		}else if(r==6) {
			fm.cube(value2);
		}else {
		System.out.println("Enter the valid number");
		Menu.list();
	}
	}

}
