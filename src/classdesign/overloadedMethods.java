/**
 * 
 */
package classdesign;

/**
 * @author vgoyal
 *
 */
public class overloadedMethods {

	private static void overload(Integer i) {System.out.println("foo(Integer)");}
	private static void overload(long l) {System.out.println("foo(long)");}
	private static void overload(short s) {System.out.println("foo(short)");}
	private static void overload(int ... a) {System.out.println("foo(int...)");}
	private static void overload(int a) {System.out.println("foo(int)");}
	public static void main(String[] args) {
		Integer i = 10;
		overload(i);
	}

}
