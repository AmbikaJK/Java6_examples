package ocpjpII.advanceclassdesign.nestedclasses;

/*
 * Inner classes (Non static)
 * 
 * 1. Local Inner class
 * Local inner class is declared inside a code block or method.
 * 
 * 2. Anonymous class
 * Anonymous inner class is a class which doesn't have name to reference and initialized at 
 * same place where it gets created. 
 * 
 * 3. Member Inner class
 * Member inner class is declared as non static member of outer class. 
 * 
 * When to use Inner class in Java, simple answer is any class 
 * which is only be used by its outer class, 
 * should be a good candidate of making inner
 *
 * Nested Inner Classes (static)
 * 
 * Nested class improves Encapsulation and help in maintenance.
 * In HashMap class, you will find that Map.Entry is a good example of nested class in Java
 * Nested classes are comparator in java
 * 
 * Difference between Inner class and nested static class 
 * Inner class require instance of outer class for initialization 
 * and they are always associated with instance of enclosing class.
 * On the other hand nested static class is not associated 
 * with any instance of enclosing class
 */

public class Outer {

	public static void main(String[] args) {
		
		// 1. Local Inner class
		class LocalClass {
			public void print() {
				System.out.println("Local Inner class...");
			}
		}
		LocalClass lc = new LocalClass();
		lc.print();
		
		// 2. Annonymous Class
		Thread annoymous = new Thread() {
			@Override
			public void run() {
				System.out.println("Anonymous class..");
			}
		};
		annoymous.start();
		
		// 3. Member Inner class
		Outer outer = new Outer();
		Outer.Inner in = outer.new Inner();
		in.print();
	}
	
	// 3. Member Inner class
	private class Inner {
		public void print() {
			System.out.println("Member Inner class..");
		}
	}
	

}
