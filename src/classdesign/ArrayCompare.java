package classdesign;

import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		
		System.out.println("arr1 == arr2" + (arr1 == arr2));
		System.out.println("arr1.equals(arr2)" + arr1.equals(arr2));
		System.out.println("Arrays.equals(arr1, arr2)" + Arrays.equals(arr1, arr2));
		
		Integer a = 1;
		Integer b = 1;
		
		System.out.println("a==b" + (a==b));
		System.out.println("a.equals(b)" + (a.equals(b)));
		
	}

}
