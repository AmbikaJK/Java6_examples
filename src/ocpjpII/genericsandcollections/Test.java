package ocpjpII.genericsandcollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static <E extends CharSequence> List<? super E> doIt(List<E> nums) {
		return nums;
	}
	
	public static void main(String[] args) {
		Object[] sa = { 100, 100.0, "100" }; 
		Collections.sort(Arrays.asList(sa), null); 
		System.out.println(sa[0]+" "+sa[1]+" "+sa[2] );
	}
}
