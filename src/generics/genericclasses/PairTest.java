package generics.genericclasses;

import java.util.ArrayList;
import java.util.List;

public class PairTest {
	public static void main(String[] args) {
		List l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		System.out.println(getM(l));
		
		List<? extends Number> l1 = new ArrayList<String>();
		l1.add("s1");
		System.out.println(getM(l1));
	}
	
	
	private static Integer getM (List<? extends Number> l) {
		int i = 0;
		for (Object o : l) {
			i += (Integer)o;
		}
		return i;
	}
}
