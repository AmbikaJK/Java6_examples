package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B extends A{
	
	public static void getExample() {
		System.out.println("in class B");
	}
	
	public static void main(String[] args) {
		//B b = (B) new A();
		//b.getExample();
		
		/*try {
			A a = new B();
			a = null;
			a.getExample();
		} catch (Exception e) {
			System.out.println("In catch block");
			throw new NullPointerException();
		} finally {
			System.out.println("In finally block");
			throw new ArrayIndexOutOfBoundsException();
		}*/
		
		List<Integer> intL = new ArrayList<Integer>();
		intL.add(1);
		intL.add(2);
		intL.add(3);
		intL.add(1);
		intL.add(2);
		
		Integer[] a = new Integer[20];
		for (Integer i : intL) {
			a[i] = i;
		}
	}
}
