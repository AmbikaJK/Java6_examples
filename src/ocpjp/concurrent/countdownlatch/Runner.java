package ocpjp.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Runner extends Thread{

	CountDownLatch counter;
	
	public Runner(CountDownLatch counter, String name) {
		this.counter = counter;
		this.setName(name);
		System.out.println(getName() + " is ready to run");
		this.start();
	}
	
	@Override
	public void run() {
		try {
			counter.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName() + " is strated running");
		
		
	}
	
}
