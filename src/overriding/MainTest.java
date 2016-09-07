/**
 * 
 */
package overriding;

/**
 * @author vgoyal
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DerivedSet ds = new DerivedSet();
		ds = ds.copy();
		System.out.println("ds : " + ds.getStr());
		
	}

}
