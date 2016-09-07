package ocpjp.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
/*	public static void main(String[] args) {
		BoxExample<String,Integer> b = new BoxExample<String, Integer>();
		b.setVal("a");
		b.setVal2(1);
		System.out.println(b);
		
		BoxExample<Integer, String> b1 = new BoxExample<Integer, String>();
		b1.setVal(1);
		b1.setVal2("b");
		System.out.println(b1);
		
		List<Integer> intList1 = new ArrayList<Integer>();
		List<? extends Number> intList = new ArrayList<Integer>();
		//intList = new ArrayList<Integer>();
		
		
		intList1.add(new Integer(10));
		intList.addAll(intList1);
		intList.addAll(c);
	}*/
	
	
	
	
	public static Double sum(List<? extends Number> numList) {
		Double result = 0.0;
		for (Number num : numList) {
			result += num.doubleValue();
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		List<Double> doubleList = new ArrayList<Double>();
		for (int i = 0; i < 5; i++) {
			intList.add(i);
			doubleList.add((double) (i * i));
		}
		System.out.println("The intList is: " + intList);
		System.out
				.println("The sum of elements in intList is: " + sum(intList));
		System.out.println("The doubleList is: " + doubleList);
		System.out.println("The sum of elements in doubleList is: "
				+ sum(doubleList));
	}
}
