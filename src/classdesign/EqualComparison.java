package classdesign;

public class EqualComparison {

	static class Emp {
		
		private int age;
		Emp (int age) {
			this.age = age;
		}
		
		@Override
		public boolean equals(Object obj) {
			Emp emp = (Emp) obj;
			return this.age == emp.age;
		}
	}
	
	public static void main(String[] args) {
		equalsFunctionality();
		operatorCheck();
	}
	
	/*
	 * "==" used for primitives like float, int and object memory reference check 
	 * if two objects refering to the same memory space then it becomes true 
	 */
	private static void operatorCheck() {
		Integer i1 = 260;
		Integer i2 = 260;
		Integer i3 = 5;
		Integer i4 = 5;
		
		System.out.println("(i1 == i2) " + ((int)i1 == (int)i2));
		System.out.println("(i3 == i4) " + (i3 == i4));
		System.out.println("i1.equals(i2)" + i1.equals(i2));
		System.out.println("i3.equals(i4)" + i3.equals(i4));
	}
	
	/*
	 * equals method does the same thing as == but the difference is it can be overridden
	 * We can write our own functionality for equality check
	 * equal has contract with hashcode method in Java and whenever you override equals method you have to override hashcode method 
	 */
	private static void equalsFunctionality () {
		EqualComparison.Emp emp1 = new EqualComparison.Emp(23);
		EqualComparison.Emp emp2 = new EqualComparison.Emp(23);
		System.out.println("emp1.equals(emp2)" + emp1.equals(emp2));
	}
	
	/*
	 * Conclusions :
	 *  1) use == to compare primitive e.g. boolean, int, char etc, while use equals() to compare objects in Java.
	 *	2) == return true if two reference are of same object. Result of equals() method depends on overridden implementation.
	 *	3) For comparing String use equals() instead of  == equality operator.
	 *	Read more: http://javarevisited.blogspot.com/2012/12/difference-between-equals-method-and-equality-operator-java.html#ixzz2gQa4xS4T
	 */
	

}