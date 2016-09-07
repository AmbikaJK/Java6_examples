/**
 * 
 */
package classdesign;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author vgoyal
 *
 */
public class HashcodeImp {
	
	int a = 1;
	
	public HashcodeImp () {}
	
	public HashcodeImp (int a) {
		this.a = a;
	}
	
	/*
	 * Two objects are equal, if there hashcode are equal
	 * if we override equals method then we should also override hashcode for maintaining their equality.
	 */
	
	@Override
	public boolean equals(Object obj) {
		HashcodeImp hs = (HashcodeImp) obj;
		return a == hs.a;
	}
	
	@Override
	public int hashCode() {
		int h = 3;
		h = h ^ this.a;
		return h;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashcodeImp h1 = new HashcodeImp();
		HashcodeImp h2 = new HashcodeImp();
		
		//h1 = h2;
		System.out.println("h1.equals(h2) " + h1.equals(h2));
		System.out.println("h1.hashCode() " + h1.hashCode() + "\th2.hashCode()" + h2.hashCode());
		HashMap<Integer, HashcodeImp> hMap = new HashMap<Integer, HashcodeImp>();
		hMap.put(h1.hashCode(), h1);
		hMap.put(h2.hashCode(), h2);
		
		for (Entry<Integer, HashcodeImp> e: hMap.entrySet()) {
			System.out.println("key : " + e.getKey() + ", Value : " + e.getValue().a);
		}
	}
}
