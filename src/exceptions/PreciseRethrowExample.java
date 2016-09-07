/**
 * 
 */
package exceptions;

/**
 * @author vgoyal
 *
 */
public class PreciseRethrowExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			foo ();
		} catch (NumberFormatException nfe) {
			System.out.println("Number Format Exception");
		}
	}
	
	
	private static void foo () throws NumberFormatException {
		try {
			int i = Integer.parseInt("ten");
		} catch (Exception ex) {
			throw ex;
			//System.out.println(ex.);
		}
	}
}
