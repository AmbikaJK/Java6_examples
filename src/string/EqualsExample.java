/**
 * 
 */
package string;

/**
 * @author vgoyal
 *
 */
public class EqualsExample {
	
	public static void main(String[] args) {
		String s1 = "12";
		String s2 = new String ("12");
		String s3 = "12";
		
		if (s1 == s2) {
			System.out.println("==");
		}
		
		if (s1.equals(s2)) {
			System.out.println("eqauls");
		}
		
		if (s1 == s3) {
			System.out.println("1==");
		}
	}
}
