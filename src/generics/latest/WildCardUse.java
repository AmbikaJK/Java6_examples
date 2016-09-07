package generics.latest;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {
	
	private static void printList(List<? extends Number> l) {
		
		for (Object o :l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		//printList(l);
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(100);
		printList(l1);
		
		
		
	}
}
