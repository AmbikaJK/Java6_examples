/**
 * 
 */
package string;

/**
 * @author vgoyal
 *
 */
public class SwitchExample {
	public static void main(String[] args) {
		try {
			
			String s = null;
			
			System.out.println("length : " + s.length());
			
			
		} catch (NullPointerException npe) {
			System.out.println("Null pointer" + npe);
		}
	}
}
