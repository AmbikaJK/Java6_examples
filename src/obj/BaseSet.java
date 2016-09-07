/**
 * 
 */
package obj;

/**
 * @author vgoyal
 *
 */
public class BaseSet {
	public static void foo (BaseSet obj) {
		System.out.println("In Base foo");
		obj.bar();
	}
	
	public void bar () {
		System.out.println("In Base Bar");
	}
}
