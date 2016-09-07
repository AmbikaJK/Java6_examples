package instanceOf;

import obj.DeriClass;
import obj.EventSet;

public class InstanceOfOper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//EventSet es = new DeriClass();
		EventSet es = new EventSet();
		if (es instanceof DeriClass) {
			System.out.println("instance true");
		} else {
			System.out.println("instance false");
		}
		
		//es = null;
		if (es instanceof EventSet) {
			System.out.println("$$$$$instance true");
		} else {
			System.out.println("$$$$$instance false");
		}
	}

}
