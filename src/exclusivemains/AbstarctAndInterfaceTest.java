/**
 * 
 */
package exclusivemains;

import interfaces.InterfaceI1;
import abstarctClasses.AbstractClass;

/**
 * @author vgoyal
 *
 */
public class AbstarctAndInterfaceTest extends AbstractClass implements InterfaceI1{

	//private String name;
	public AbstarctAndInterfaceTest (String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		AbstarctAndInterfaceTest ait = new AbstarctAndInterfaceTest("CODE JAVA");
		System.out.println("Book Name is : " + ait.name);
	}

}
