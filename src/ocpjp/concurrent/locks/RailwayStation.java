package ocpjp.concurrent.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RailwayStation extends Thread {

	static Lock station = new ReentrantLock();
	static Condition joeArrival = station.newCondition();
	
	static class Train extends Thread {
		
		public Train(String name) {
			this.setName(name);
			this.start();
		}
		
		public void run() {
			try {
				station.lock();
				System.out.println( getName() +"has arrived");
				if ("1".equals(getName())) {
					joeArrival.signalAll();
				}
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				station.unlock();
			}
		}
	}
	
	static class WaitingJoe extends Thread {
		
		@Override
		public void run() {
			System.out.println("waiting for joe's train");
			station.lock();
			try {
				joeArrival.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("pick joe");
				station.unlock();
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		new WaitingJoe().start();
		new Train("1");
		new Train("2");
		new Train("3");
		new Train("4");
	}
}
