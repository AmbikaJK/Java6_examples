package generics;

import java.util.Vector;

public class OldContainerTest {
	
	public static void main(String[] args) {
		Vector vc = new Vector();
		vc.add("100.0f");
		vc.add("100");
		for (int i = 0; i < vc.size(); i++) {
			System.out.println("" + vc.get(i));
		}
	}	
}
