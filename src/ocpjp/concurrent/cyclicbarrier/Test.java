package ocpjp.concurrent.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Test {

	public static void main(String[] args) {
		
		CyclicBarrier c = new CyclicBarrier(4, new MultiPlayer());
		
		new Player(c, "1");
		new Player(c, "2");
		new Player(c, "3");
		new Player(c, "4");
		
		
		
		
	}
}
