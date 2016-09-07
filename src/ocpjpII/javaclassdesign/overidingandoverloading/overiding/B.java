package ocpjpII.javaclassdesign.overidingandoverloading.overiding;

import java.io.FileNotFoundException;

public class B extends A {
	
	public static int getX (int i) throws FileNotFoundException{
		System.out.println("In class B..");
		return i;
	}
	
	@Override
	public int getY(int i) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return i;
	}
	
}
