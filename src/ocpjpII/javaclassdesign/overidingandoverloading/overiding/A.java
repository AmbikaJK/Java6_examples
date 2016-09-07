package ocpjpII.javaclassdesign.overidingandoverloading.overiding;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Overiding  
 * 
 * 1. A static method can be override 
 * 		1. We cann't define it as a @override annotation
 * 		2. It can also be defined in both the classes
 * 		3. A.getX() refer A class
 * 		4. B.getX() refer B class // But if getX() method is not present in B class so it refers to class A
 * 		5. For static method calling first it checks in its own class if not present then checks for parent class..
 * 
 * 		6. return type : cann't be different
 * 		7. Access Modifier : Cann't reduce the visibility of inherited method
 * 			in Class A if a method is public
 * 			so in extended class B we cann't define it as a private
 *  	8. Thorws and Throw : 
    		If the superclass method does not declare an exception
        		If the superclass method does not declare an exception, 
        		subclass overridden method cannot declare the checked exception 
        		but it can declare unchecked exception.
    		If the superclass method declares an exception
        		If the superclass method declares an exception, 
        		subclass overridden method can declare same, 
        		subclass exception or no exception but cannot declare parent exception.
 * 		
 * 
 * 
 * 
 */


public class A {
	
	public static int getX (int i) throws IOException {
		System.out.println("In class A..");
		return i;
	}
	
	public int getY (int i) throws ArrayIndexOutOfBoundsException {
		System.out.println("In class A..");
		return i;
	}
}
