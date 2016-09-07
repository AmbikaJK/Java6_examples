/**
 * 
 */
package generics.genericclasses;

/**
 * @author vgoyal
 *
 */
public class Pair<T1,T2> {

	T1 obj1;
	T2 obj2;
	
	public Pair(T1 obj1, T2 obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	@Override
	public String toString() {
		return "obj1 : " + obj1 + ", obj2 : " + obj2;
	}	
}
