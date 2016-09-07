package ocpjp.concurrent.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player extends Thread {

	CyclicBarrier waitCyclic;
	
	public Player(CyclicBarrier cb, String name) {
		this.waitCyclic = cb;
		this.setName(name);
		System.out.println(getName() + "is ready");
		this.start();
	}
	
	@Override
	public void run() {
		
		try {
			waitCyclic.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
