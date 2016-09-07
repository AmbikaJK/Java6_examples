package ocpjpII.javaclassdesign.overidingandoverloading.overloading;

import java.io.IOException;

/*
 * Overloading means same name function but either different in 
 * 1. Type parameter 
 * 2. or number of parameter
 * 
 * It none affects by :  
 * 1. return type
 * 2. access modifier
 * 3. static keyword 
 * 4. throw exception
 * 
 */

public class OverloadingTestExample {
	
	private static void printX (int x) {
		System.out.println(x);
	}
	
	private static void printxy (int x, int y) {
		System.out.println(x + ", " + y);
	}
	
	public static void main(String[] args) {
		printX(1);
		printxy(2, 3);
	}
}
