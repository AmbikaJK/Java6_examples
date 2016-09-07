package ocpjp.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Test {
	
	
	public static void main(String[] args) {
		
		CountDownLatch counter = new CountDownLatch(5);
		
		new Runner(counter, "Carl");
		new Runner(counter, "Carl1");
		new Runner(counter, "Carl2");
		
		long count = counter.getCount();
		while(count > 0){
			try {
				Thread.sleep(1000);
				System.out.println(count);
				counter.countDown();
				count = counter.getCount();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
			
		
	}
	
	
	
}
