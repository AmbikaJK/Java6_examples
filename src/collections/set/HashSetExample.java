package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> strSet = new TreeSet<String>();
		String s = "feel it feel others behave gentle be gentle";
		String [] sArr = s.split(" ");
		for (String ss : sArr) {
			strSet.add(ss);
		}
		System.out.println(strSet);
	}
}
