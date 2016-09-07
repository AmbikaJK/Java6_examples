package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArraylistExample {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("d");
		l.add("e");
		System.out.println("Before : " + l);
		//using iterator
		Iterator<String> itrL = l.iterator();
		while (itrL.hasNext()) {
			String s = itrL.next();
			System.out.println(s);
			//itrL.remove();
		}
		//using listiterator 
		ListIterator<String> lItr = l.listIterator(l.size());
		while (lItr.hasPrevious()) {
			String s = lItr.previous();
			System.out.println(s);
		}
		System.out.println("After : " + l);
	}
}
