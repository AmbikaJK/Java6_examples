package ocpjpII.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	static AtomicInteger ai = new AtomicInteger(0); 
	public static void increment() {
		ai.addAndGet(1);
		ai.incrementAndGet();
	}	
	//other valid code 
}
