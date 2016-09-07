package test;

public class PassByValue1 {
	
	private static void concatString(Integer i) {
		i = 4;
		//s1 = s1 + "Goel";
	}
	
	public static void main(String[] args) {
		
		Integer i = 3;
		concatString(i);
		System.out.println(i);
		
	}
}
