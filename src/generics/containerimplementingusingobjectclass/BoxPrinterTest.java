package generics.containerimplementingusingobjectclass;

public class BoxPrinterTest {

	public static void main(String[] args) {
		
		BoxPrinter bp = new BoxPrinter(new Integer(10));
		System.out.println(bp);
		bp = new BoxPrinter(new String("Hello"));
		System.out.println(bp);
	}
	
}
