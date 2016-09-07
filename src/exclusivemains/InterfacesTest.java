/**
 * 
 */
package exclusivemains;

import interfaces.Biped;
import interfaces.Birdie;
import abstarctClasses.NonFyler;

/**
 * @author vgoyal
 *
 */
public class InterfacesTest extends NonFyler implements Biped, Birdie{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterfacesTest IT = new InterfacesTest();
		IT.walk();
		IT.fly();
	}

	@Override
	public void walk() {
		System.out.print("walk ");
	}

}
