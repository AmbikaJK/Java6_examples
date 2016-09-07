package generics;

public class BoxPrinterTest {
	public static void main(String[] args) {
		BoxPrinter<Integer> bPInt = new BoxPrinter<Integer>(10);
		Integer i = bPInt.getVal();
		System.out.println("Integer : " + i);
		
		BoxPrinter<String> bxPS = new BoxPrinter<String>("Hello");
		String s = bxPS.getVal();
		System.out.println("String : " + s);
	}
}
