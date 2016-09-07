package ocpjp.concurrent.atomicvaribles;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
	
	private static void incrementAtomicInteger() {
		
		new Thread(){
			@Override
			public void run() {
				System.out.println("increment atomic integer : " + ai.incrementAndGet());
			}
		}.start();
		
	}
	
	private static void incrementInteger() {
		
		new Thread(){
			@Override
			public void run() {
				System.out.println("increment integer : " + ++i);
			}
		}.start();;
		
	}
	
	private static AtomicInteger ai = new AtomicInteger(0);
	private static Integer i = new Integer(0);
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 5; i++) {
			incrementAtomicInteger();
			incrementInteger();
		}
		
		
		
		
	}

}
