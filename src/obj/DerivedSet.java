/**
 * 
 */
package obj;

/**
 * @author vgoyal
 *
 */
public class DerivedSet extends BaseSet{
	public static void foo (BaseSet obj) {
		System.out.println("In Derived foo");
		obj.bar();
	}
	
	public void bar () {
		System.out.println("In Derived Bar");
	}
}
